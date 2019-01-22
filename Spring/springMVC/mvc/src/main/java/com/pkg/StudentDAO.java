package com.pkg;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

@Component
public class StudentDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int insertStudent(Student student) {
		String query = "insert into students(id, name) values (?, ?)";
		return jdbcTemplate.update(query, new Object[] { student.getStudentId(), student.getStudentName()});
	}

	public List<Student> getAllStudents() {
		String query = "SELECT * FROM students";
		return jdbcTemplate.query(query,new ResultSetExtractor<List<Student>>(){
			public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Student> students = new ArrayList<Student>();
				while (rs.next()) {
					Student student = new Student();
					student.setStudentId(rs.getString("id"));
					student.setStudentName(rs.getString("name"));
					students.add(student);
				}
				return students;
			}
		});
	}
}
