package test.junit;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class Main {

	public List<Students> csvReadList() throws NumberFormatException, IOException {

		CSVReader r = new CSVReader(new FileReader("students.csv"));
		List<Students> listStudents = new ArrayList<Students>();
		String[] record = null;

		while ((record = r.readNext()) != null) {
			Students students = new Students();
			students.setStudentName(record[1]);
			students.setStudentId(Integer.parseInt(record[0]));
			students.setStudentAge(Integer.parseInt(record[2]));
			List<Integer> n = new ArrayList<Integer>();
			n.add(Integer.parseInt(record[4]));
			n.add(Integer.parseInt(record[6]));
			students.setSub2Marks(n);
			students.setTotalMarks(Integer.parseInt(record[7]));
			listStudents.add(students);
		}

		r.close();

		return listStudents;
	}

	@Test
	public String csvPutInSet(Set<Students> SetStudents, float maxMark) throws IOException {

		CSVWriter w = new CSVWriter(new FileWriter("output.csv"));
		List<String[]> StudentRecord = new ArrayList<String[]>();

		String header = "rank,id,name,age,Sub1marks,Sub2marks,Totalmarks,percentile";
		w.writeNext(header.split(","));
		int i = 1;
		for (Students st : SetStudents) {
			double per = st.getPercentile();
			per = Math.ceil((st.getTotalMarks() / maxMark) * 100);
			st.setPercentile(per);
			st.setStudentRank(i);
			StudentRecord.add(st.toArrStr().split(","));
			i++;
		}
		w.writeAll(StudentRecord);
		w.close();
		return "printed in output file output.csv";

	}

	public String MainCal() throws NumberFormatException, IOException {

		Main m = new Main();
		List<Students> studentList = new ArrayList<Students>();

		Set<Students> studentSet = new TreeSet<Students>(new Comparator<Students>() {
			public int compare(Students s1, Students s2) {
				Integer s1TotMarks = s1.getTotalMarks();
				Integer s2TotMarks = s2.getTotalMarks();

				return s2TotMarks.compareTo(s1TotMarks);
			}
		});

		for (Students s : m.csvReadList()) {
			studentSet.add(s);
		}

		for (Students s : studentSet) {
			studentList.add(s);
		}

		float maxMark = studentList.get(0).getTotalMarks();
		m.csvPutInSet(studentSet, maxMark);

		return "main function works";
	}
}