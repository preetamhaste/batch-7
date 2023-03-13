package testNgPractice;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {
	
	String actual ;
	WebDriver driver;
	@Test
	public void assertclass () {
		
		System.setProperty("wedriver.chrome.driver", "D:\\Browsers Download\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		assertEquals(title, "Practice Page");
		
		WebElement str = driver.findElement(By.cssSelector("body > h1"));
		actual = str.getText();
		System.out.println("===== " + actual);
		assertEquals(actual, "Practice Page");
		
		assertNotEquals(actual, "Preetam");
		
		driver.close();
	}
	
	@AfterTest
	public void notEquals() {
		
		System.out.println("assert true condition");
		SoftAssert sf = new SoftAssert();
		
		assertFalse(1!=1);
		
		
		System.out.println("This is after test method");
		sf.assertAll();
		assertNotEquals(actual, "preetam");
		
		String xyz = null;
		assertNull(xyz);
		System.out.println("====== Passed");
		
		System.out.println("fail me");
		
	}
	

}
