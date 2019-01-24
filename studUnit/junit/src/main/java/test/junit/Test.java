package test.junit;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	@org.junit.Test
	public void testReadCSV() throws NumberFormatException, IOException {

		Main m = new Main();
		assertEquals(m.csvReadList().size(), 99);
	}

	@org.junit.Test
	public void testWriteCSV() throws IOException {

		Main m = new Main();
		Set<Students> set = new TreeSet<Students>(new Comparator<Students>() {
			public int compare(Students s1, Students s2) {
				Integer s1TotMarks = s1.getTotalMarks();
				Integer s2TotMarks = s2.getTotalMarks();

				return s2TotMarks.compareTo(s1TotMarks);
			}
		});

		for (Students s : m.csvReadList()) {
			set.add(s);
		}
		assertEquals(m.csvPutInSet(set, 195), "printed in output file output.csv");
	}
	
	@org.junit.Test
	public void testMain() throws NumberFormatException, IOException {
		
		Main m = new Main();
		
		assertEquals(m.MainCal(), "main function works");
	}
}