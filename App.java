package com.mycompany.app.seleniumWebsite_test;

/**
 * Hello world!
 *
 */
import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;
public class App
{
	@Test
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","/home/edureka/chromedriver");
	ChromeOptions chromeOptions = new ChromeOptions();
	chromeOptions.addArguments("--headless");
	WebDriver driver = new ChromeDriver(chromeOptions);
	driver.get("http://localhost:3001/");
	driver.findElement(By.name("login")).sendKeys("devops");
	driver.findElement(By.name("password")).sendKeys("test");
	driver.findElement(By.name("click")).click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	String test = driver.findElement(By.name("test")).getText();
	assertEquals(test, "Login Succeeded");
	System.out.println("Test Succeeded!!");
	driver.quit();
	}
}