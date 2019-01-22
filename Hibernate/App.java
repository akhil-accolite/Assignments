package hibernate.pojo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class App {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();

//		Student s = new Student();
//		s.setId(1);
//		s.setName("akhil");
//		session.save(s);
//		
//		//System.out.println(id);
//		
//		Course c = new Course();
//		c.setCourseId(1);
//		c.setCourseName("java");
//		c.setStudentId(1);
//		
//		session.save(c);

		Criteria cr = session.createCriteria(Student.class);
		Criteria crc = session.createCriteria(Course.class);

////////////////////////////return name with id = 1
		cr.add(Restrictions.eq("id", 1));

////////////////////////////return list with id = 1 and course = java	
		crc.add(Restrictions.disjunction().add(Restrictions.eq("studentId", 1))
				.add(Restrictions.eq("courseName", "java")));
		
		List<Student> s = cr.list();
		
		
////////////////////////////return join with id = 1 restriction and getting all courses for the given id		
		for (Student student : s) {
			System.out.println(student.getName() + "|" + student.getId() + "|"
					+ (!student.getCourses().isEmpty() ? student.getCourses().get(1).getCourseName() : ""));
		}
//
//		System.out.println(cr.list().toString());
//		System.out.println(crc.list().toString());
		session.getTransaction().commit();

	}

}
