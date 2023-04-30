package spring.core.session05.aop;

import java.util.Arrays;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class MyLoggerAspect {
	@Before(value = "execution(* *(..))")
	public void beforeAdvice(JoinPoint joinpoint) {
		String methodName = joinpoint.getSignature().getName();
		Object[] args = joinpoint.getArgs();
		System.out.printf("呼叫前置通知-方法名稱:%s 方法參數:%s\n", methodName, Arrays.toString(args));
	}
}
