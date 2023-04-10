package assignment2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	WebDriver driver;
	ConfigRead conf;

	@Test
	public void login() throws Exception {

		System.out.println("login test case");

		Thread.sleep(5000);
		WebElement txtEmail = driver.findElement(By.id("Email"));

		txtEmail.clear();

		Thread.sleep(5000);

		txtEmail.sendKeys(conf.getEmail());

		driver.findElement(By.name("Password")).clear();
		Thread.sleep(5000);
		driver.findElement(By.name("Password")).sendKeys("admin");

	}

	@AfterMethod
	public void closeApp() throws Exception {

		System.out.println("closing application");

		Thread.sleep(5000);
		driver.close();
	}

	@BeforeMethod
	public void launchApp() throws Exception {

		System.out.println("launching application");

		driver = WebDriverManager.chromedriver().create();

		conf = new ConfigRead();

		System.out.println(conf.getApplicationURL());

		driver.get(conf.getApplicationURL());

	}

}
