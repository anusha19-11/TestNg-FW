package sampleTwo;

import org.testng.annotations.Test;

public class Class03 {

	@Test(groups= {"Regression"})
	public void method01(){
		System.out.println("Method-1 from Class-3");
	}
	
	@Test
	public void method02(){
		System.out.println("Method-2 from Class-3");
	}
}
