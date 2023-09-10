package com.github.sandros22.cursospring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {
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
		return new Person("Dogla", 45, new Address("Muahaha", "Bino"));
	}

	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
	}

	@Bean
	public Person person3Parameters(String name, int age, Address address3) {
		return new Person(name, age, address3);
	}

	@Bean(name = "batata")
	public Address address() {
		return new Address("Evergreen Terrace", "Springfield");
	}

	@Bean
	public Address address3() {
		return new Address("Planalto", "DF");
	}
}
