package testNgPractice;

import org.testng.annotations.Test;

public class testNgPractice {
		
		

	@Test()
	public void TestClass() {
		System.out.println("===================this is a test method class");
		
	}
	
	@Test(dependsOnMethods = "TestClass2")
	public void TestClass1(){
		
		System.out.println("=========this is a dependent method class");
		
	}
	
	@Test
	public void TestClass2() {
		
	
		 
		System.out.println("value of c");
		
	}
}


