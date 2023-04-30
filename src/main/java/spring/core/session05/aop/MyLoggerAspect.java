package spring.core.session05.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class MyLoggerAspect {
	@Before(value = "execution(public Integer spring.core.session05.aop.CalcImpl.add(Integer,Integer))")
	public void beforeAdvice() {
		System.out.println("呼叫前置通知");
	}
}
