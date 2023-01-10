package com.regression;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class PracticeParameterAnnotationTestNG {
	
	@Test
	@org.testng.annotations.Parameters({"URL","user","password"})
	public void test(String URL,String user,String password) {
		System.out.println(URL);
		System.out.println(user);
		System.out.println(password);
	}

}