package com.github.sandros22.springboot.cspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses() {
		return Arrays.asList(new Course(1, "Java", "Sandro"), new Course(2, "Python", "Sandro"), new Course(3, "OracleDB", "Sandro"));
	}
}
