package session06;

import java.util.List;
import java.util.Optional;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.core.session06.jdbc.dao.EmpDao;
import spring.core.session06.jdbc.entity.Emp;

public class EmpReadTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc-config.xml");
		EmpDao empDao = ctx.getBean(EmpDao.class);
		System.out.println(empDao.queryAll());
		System.out.println(empDao.queryEmps());
//		Optional<Emp> optEmp = empDao.getOne(1);
//		if (optEmp.isPresent()) {
//			Emp emp = optEmp.get();
//			System.out.println(emp);
//		} else {
//			System.out.println("資料不存在");
//
//		}
		System.out.println(empDao.count());
		List<Emp> emps=empDao.queryEmps();
		double aveOfAge1=emps.stream().mapToInt(Emp::getAge).average().getAsDouble();
		System.out.println(aveOfAge1);
		double aveOfAge2=emps.stream().mapToInt(Emp::getAge).summaryStatistics().getAverage();
		System.out.println(aveOfAge2);
		double aveOfAge3=empDao.getAvgOfAge();
		System.out.println(aveOfAge3);
		
	
		
	}
}
