package spring.core.session05.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)

public class MySecurityAspect {
	@Pointcut(value = "execution(* spring.core.session05.aop.ComputerImpl.*(..))")
	public void pt() {

	}

	@Around(value = "pt()")
	public Object aroundAdvice(ProceedingJoinPoint joinPoint) {
		Object result = null;

		try {
			result = joinPoint.proceed();
		} catch (Throwable ex) {
			// TODO: handle exception
		} finally {

		}
		return result;
	}
}