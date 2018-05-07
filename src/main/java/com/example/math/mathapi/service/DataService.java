package com.example.math.mathapi.service;

import org.springframework.stereotype.Repository;

@Repository
public class DataService {

	public int[] getAllData() {
		return new int[] {12, 5, 3, 8, 19};
	}
}
