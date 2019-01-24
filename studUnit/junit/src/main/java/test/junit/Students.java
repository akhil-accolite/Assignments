package test.junit;

import java.util.List;

public class Students {

	private int StudentRank;
	private int StudentId;
	private String StudentName;
	private int StudentAge;
	private List<Integer> Sub2Marks;
	private int totalMarks;
	private double percentile;

	public Students() {

	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setPercentile(double per) {
		this.percentile = per;
	}

	public void setStudentRank(int studentRank) {
		StudentRank = studentRank;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	public void setSub2Marks(List<Integer> sub2Marks) {
		Sub2Marks = sub2Marks;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public void setStudentAge(int studentAge) {
		StudentAge = studentAge;
	}

	public String FromLtoString() {

		return Sub2Marks.get(0) + "," + Sub2Marks.get(1);
	}

	public String toArrStr() {
		return StudentRank + "," + StudentId + "," + StudentName + "," + StudentAge + "," + FromLtoString() + ","
				+ totalMarks + "," + percentile;
	}

	public double getPercentile() {
		return percentile;
	}

}
