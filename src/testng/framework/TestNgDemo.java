package testng.framework;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestNgDemo {
	@Test(priority=2, enabled = false)//wont execute    //dependsOnMethods= {"userReg"})-->if userReg pass,this one executes
	public void adminLoginTest() {
		System.out.println("To validate login functionality");
		Reporter.log("sample test scripts", true);
	}

	@Test (priority=1)
	public void userReg() {
		Assert.assertEquals("Anu", "Anu");
		System.out.println("To validate user registration");
		

	}
	@BeforeClass
	public void setUp() {
		System.out.println("To initialize the browser");

	}
	@AfterClass
	public void tearDown() {
		System.out.println("To close the application");

	}
}
