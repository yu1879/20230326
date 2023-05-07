package session06;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.core.session06.jdbc.dao.EmpDao;

public class EmpMultiCreateTest {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc-config.xml");
		EmpDao empDao = ctx.getBean(EmpDao.class);

		List<Object[]> list = new ArrayList<>();
		list.add(new Object[] { "Jean", 22 });
		list.add(new Object[] { "Helen", 28 });
		list.add(new Object[] { "Jack", 27 });
		int[] rowcounts = empDao.batchCreate(list);
		System.out.println(rowcounts);
	}

}
