package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Homepage1 {
	WebDriver driver;
	public Homepage1(WebDriver driver) {
		this.driver=driver;
	}
	public void signinclick() {
		
	//Scenario 1: first page clicking on singnup button
		
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		
	
		
	}
	
	
}
