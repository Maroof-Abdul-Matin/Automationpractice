package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login3 {
	WebDriver driver;

	public Login3(WebDriver driver) {
		this.driver = driver;
	}

	

	public void signin(String email) throws InterruptedException {
		
		
		
		//Scenario 3: after registration signing the account
		System.out.println("hello");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);

		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("123456");

		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
	}

}
