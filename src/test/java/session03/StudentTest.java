package session03;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.core.session03.bean.Clazz;
import spring.core.session03.bean.DBConn;
import spring.core.session03.bean.Student;
import spring.core.session03.bean.Teacher;
import spring.core.session03.java_config.AppConfig;

public class StudentTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-config3.xml");
		List<Student> students = ctx.getBean("students", List.class);
		// System.out.println(students);
//		students.forEach(student -> {
//			String name = student.getName();
//			int total = student.getClazzs().stream().mapToInt(Clazz::getCredit).sum();
//
//			System.out.printf("%s:%d\n", name, total);
//		});

		for (Student i : students) {
			int t = 0;
			for (Clazz clazz : i.getClazzs()) {
				t += clazz.getCredit();
			}
			System.out.println(i.getName() + "總學分數:" + t);

		}

	}
}
