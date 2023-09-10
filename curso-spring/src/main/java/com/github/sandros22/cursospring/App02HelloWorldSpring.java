package com.github.sandros22.cursospring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SuppressWarnings("unused")
public class App02HelloWorldSpring {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("batata"));
		// System.out.println(context.getBean(Address.class));
		System.out.println(context.getBean("person2MethodCall"));
		System.out.println(context.getBean("person3Parameters"));
		context.close();
	}

}
