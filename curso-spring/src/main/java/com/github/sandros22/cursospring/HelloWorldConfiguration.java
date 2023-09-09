package com.github.sandros22.cursospring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {
};

record Address(String firstLine, String city) {

}

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Sandro";
	}

	@Bean
	public int age() {
		return 21;
	}

	@Bean
	public Person person() {
		return new Person("Dogla", 45);
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age());
	}
	
	@Bean(name = "batata")
	public Address address() {
		return new Address("Evergreen Terrace", "Springfield");
	}
}
