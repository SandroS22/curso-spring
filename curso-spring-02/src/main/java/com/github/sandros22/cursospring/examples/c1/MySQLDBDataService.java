package com.github.sandros22.cursospring.examples.c1;

import org.springframework.stereotype.Repository;

@Repository
public class MySQLDBDataService implements DataService {

	@Override
	public int[] retrieveData() {
		return new int[] { 1, 2, 3, 4, 5};
	}
}
