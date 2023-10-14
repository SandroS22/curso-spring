package com.github.sandros22.cursospring.examples.d1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA{
	
}

@Component
@Lazy  // Só é carragado quando alguem faz o uso da classe
class ClassB{
	private ClassA classA;
	
	public ClassB(ClassA classA) {
		System.out.println("Some Initialization logic");
		this.classA = classA;
	}
	
	public void doSomethin() {
		System.out.println("Do Something");
	}
}

@Configuration
@ComponentScan
public class LazyInitializerLaucnherApplication {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(LazyInitializerLaucnherApplication.class)) {
			System.out.println("Initialization of context is completed");
			context.getBean(ClassB.class).doSomethin();
		}
	}

}
