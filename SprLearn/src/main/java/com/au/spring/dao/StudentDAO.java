package com.au.spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.au.spring.rowmapper.GetAllRowmapper;
import com.au.spring.model.Student;

@Repository
public class StudentDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Student> getStudentName() {
		return jdbcTemplate.query("select * from students", new GetAllRowmapper());
	}

	public int insertStudent(Student student) {
		return jdbcTemplate.update(
				"insert into students values (" + student.getStudentId() + ",\"" + student.getStudentName() + "\");");
	}

}