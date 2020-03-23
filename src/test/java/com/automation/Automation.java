package com.automation;

import org.testng.TestNG;

import com.testcase.CreateAccountTest;

public class Automation {

	public static void main(String[] args) {
		System.out.println("----- I am  in --------------");
		
		
		TestNG testng = new TestNG() ;
		testng.setTestClasses(new Class[] { CreateAccountTest.class });
		testng.run();
	}

}
