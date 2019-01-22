package SpringAssignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationMain {

	public static void main(String[] args) {
		
		System.out.println("\nStart : Using Spring:***********************\n");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		JDBCTemplateDao jdbc = (JDBCTemplateDao) applicationContext.getBean("jdbcTemplateDao");
		
		Student fac1 = (Student) applicationContext.getBean("bean1");
		Student fac2 = (Student) applicationContext.getBean("bean2");
	
//		Student student1 = new Student();
//		student1.setStudentName("oneguy");
//		student1.setStudentId(3);
		
//		jdbc.saveStudentName(student1);///////////student name added to the studentName table
//		jdbc.saveStudentId(student1);/////////////student id added to the studentIdtable
		
		////////ASSIGNMENT 1//////////
		System.out.println("///////////selecting all students from the table SprStudent using resultSet/////////////");
		System.out.println(jdbc.getAllStudents().toString());///////////selecting all students from the table SprStudent using resultSet
		System.out.println("\n\n///////////////selecting 5 students from table students using RowMapper///////////////////");
		System.out.println(jdbc.getAllStudentsRowMapper());/////////////selecting 5 students from table students using RowMapper
		
		/////////ASSIGNMENT 3////////////
		
		System.out.println("\n\nusing factory method//////////////////////////////////// displaying college for studentCollege");
		System.out.println(fac1.toStr());
		System.out.println(fac2.toStr());
		
		((AbstractApplicationContext) applicationContext).close();
	}
}