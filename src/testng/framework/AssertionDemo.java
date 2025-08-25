package testng.framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;



@Test
public class AssertionDemo {

	WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("initialization script executed");

	}
     @Test
	@Parameters({"userid","password"})
	public void adminLogin(String uid, String pwd) {

		// to perform login operation
		driver.findElement(By.name("username")).sendKeys(uid);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("Performed Login Operation");
	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
		System.out.println("Application closed");

	}

}
