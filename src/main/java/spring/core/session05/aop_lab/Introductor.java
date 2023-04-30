package spring.core.session05.aop_lab;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Introductor {

	@DeclareParents(value = "spring.core.session05.aop_lab.Performance+", defaultImpl = BackSinger.class

	)

	public Singer singer;
}
