package com.github.sandros22.cursospring.examples.c1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class RWExampleSimpleSpringContextLaucnherApplication {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(
				RWExampleSimpleSpringContextLaucnherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
		}
	}

}
