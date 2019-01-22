package hibernate.pojo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "college")
class college {

	@Id
	@Column(name = "collegeId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	int collegeId;
	@Column(name = "collegeName")
	String collegeName;
	@Column(name = "studentId")
	int studentId;
	

	public college(int collegeId, String collegeName, int studentId) {
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.studentId = studentId;
	}

	public int getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getCollegeName() + "   " + getStudentId() + " ";
	}

}