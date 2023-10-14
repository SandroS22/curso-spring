package com.github.sandros22.cursospring.examples.f1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass {
	private SomeDependency someDependency;

	public SomeClass(SomeDependency someDependency) {
		super();
		System.out.println("All dependecies are ready");
		this.someDependency = someDependency;
	}

	@PostConstruct // É chamado após a injeção de dependencia
	public void initialize() {
		someDependency.getReady();
	}

	@PreDestroy // Chamado antes do bean ser removido do contexto
	public void cleanup() {
		System.out.println("Cleanup");
	}
}

@Component
class SomeDependency {

	public void getReady() {
		System.out.println("Some logic using SomeDependecy");
	}

}

@Configuration
@ComponentScan
public class PrePostAnnotationLaucnherApplication {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(PrePostAnnotationLaucnherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
	}

}
