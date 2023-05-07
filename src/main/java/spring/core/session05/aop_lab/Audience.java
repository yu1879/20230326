package spring.core.session05.aop_lab;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Component
@Aspect
public class Audience {
	@Pointcut(value = "execution(* spring.core.session05.aop_lab.Performance.perform(..))")
	public void pt() {

	}

	@Before(value = "pt()")
	public void silenceCellPhone() {
		System.out.println("觀眾-將手機設為靜音");
	}

	@Before(value = "pt()")
	public void takeSeats() {
		System.out.println("觀眾-找到座位");
	}

	@After(value = "pt()")
	public void exit() {
		System.out.println("觀眾-拍手鼓掌");
	}

	@AfterReturning(value = "pt()")
	public void applause() {
		System.out.println("觀眾-離開表演會場");
	}

	@AfterThrowing(value = "pt()", throwing = "ex")
	public void exception(Throwable ex) {
		System.out.println("觀眾-加油加油~噓聲.." + ex);
	}

}
