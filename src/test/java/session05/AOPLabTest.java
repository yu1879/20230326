package session05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.core.session05.aop.Computer;
import spring.core.session05.aop.ComputerImpl;
import spring.core.session05.aop_lab.AOPConfig;
import spring.core.session05.aop_lab.Performance;
import spring.core.session05.aop_lab.Singer;

public class AOPLabTest {
	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(AOPConfig.class);
		Performance dancer = ctx.getBean("dancer", Performance.class);
		try {
			dancer.perform();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println("舞者 dancer 轉歌者 back singer");
			Singer singer = (Singer) dancer;
			singer.sing();
		}
	}
}
