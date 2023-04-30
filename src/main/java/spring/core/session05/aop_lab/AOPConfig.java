package spring.core.session05.aop_lab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan()
//@ComponentScan(basePackages = { "spring.core.session05.aop_lab" })
public class AOPConfig {
	@Bean(name = "dancer")
	public Performance dancer() {
		Dancer dancer = new Dancer();

		return dancer;
	}
}
