package session06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.core.session06.jdbc.dao.EmpDao;

public class EmpCreateTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc-config.xml");
		EmpDao empDao = ctx.getBean(EmpDao.class);
		int rowcount = empDao.create("Joee", 21);
		System.out.println("單筆新增" + rowcount);
		if (rowcount == 0) {
			System.out.println("新增失敗");
		} else {
			System.out.println("新增成功");

		}
	}
}
