package SpringAssignment;

public class Student {

	private int studentId;
	private String studentName;

	private String college;
	
	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " " + getStudentId() + ":" + getStudentName();
	}
	
	public String toStr() {
		// TODO Auto-generated method stub
		return getCollege();
	}
}