package hibernate.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "courses")
public class Course {

	@Id
	@Column(name = "courseId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer courseId;

	@Column(name = "courseName")
	public String courseName;

	@Column(name = "studentId")
	public Integer studentId;

	public Course(Integer courseId, String courseName, Integer studentId) {

		this.courseId = courseId;
		this.courseName = courseName;
		this.studentId = studentId;
	}

	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getCourseName() + "   " + getStudentId() + " ";
	}
}
