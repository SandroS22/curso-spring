package com.github.sandros22.cursospring.examples.e1;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass {

}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass {

}

@Configuration
@ComponentScan
public class BeanScopesLaucnherApplication {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(BeanScopesLaucnherApplication.class)) {
			System.out.println(context.getBean(NormalClass.class)); // Os 3 print mostram o mesmo bean - Singleton
			System.out.println(context.getBean(NormalClass.class)); // Mesmo Bean do acima
			System.out.println(context.getBean(NormalClass.class)); // Mesmo Bean do acima

			System.out.println(context.getBean(PrototypeClass.class)); // Cada ProtoType recebe um novo bean - Prototype
			System.out.println(context.getBean(PrototypeClass.class)); // Nova instância
			System.out.println(context.getBean(PrototypeClass.class)); // Nova instância
		}
	}

}
