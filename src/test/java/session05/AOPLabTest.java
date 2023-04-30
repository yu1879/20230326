package session05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.core.session05.aop.Computer;
import spring.core.session05.aop.ComputerImpl;
import spring.core.session05.aop_lab.AOPConfig;
import spring.core.session05.aop_lab.Performance;

public class AOPLabTest {
	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(AOPConfig.class);
		Performance dancer = ctx.getBean("dancer", Performance.class);
		dancer.perform();
	}
}
