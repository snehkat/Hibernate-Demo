package com.springmvc.model;

import org.springframework.stereotype.Service;

@Service
public class DataService {

	public String[] getPeople() {
		String n[]= {"Nicholas","John","Ram","Shyam","Vinay"};
		return n;
	}
}
