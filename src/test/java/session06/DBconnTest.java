package session06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import spring.core.session06.jdbc.dao.EmpDao;

public class DBconnTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc-config.xml");
		EmpDao empDao = ctx.getBean(EmpDao.class);
		System.out.println(empDao.queryAll());
		System.out.println(empDao.queryEmps());
//		ComboPooledDataSource cp = ctx.getBean("dataSource", ComboPooledDataSource.class);
//
//		try {
//			System.out.println(cp.getConnection());
//			System.out.println("連線成功");
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("連線失敗");
//			e.printStackTrace();
//		}
//

	}
}
