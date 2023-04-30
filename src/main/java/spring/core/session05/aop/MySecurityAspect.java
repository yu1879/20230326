package spring.core.session05.aop;

import java.util.Arrays;

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
			String methodName = joinPoint.getSignature().getName();
			Object[] args = joinPoint.getArgs();
			System.out.printf("環繞通知(前置通知) - 方法名稱：%s 方法參數：%s\n", methodName, Arrays.toString(args));
			result = joinPoint.proceed();
			System.out.printf("環繞通知(返回通知) - result：%s\n", result);

		} catch (Throwable ex) {
			System.out.printf("環繞通知(異常通知) - ex：%s\n", ex);
		} finally {
			System.out.printf("環繞通知(後置通知)\n");

		}
		return result;
	}
}