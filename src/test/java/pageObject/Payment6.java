package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Payment6 {
	WebDriver driver;

	public Payment6(WebDriver driver) {
		this.driver = driver;
	}
	
/*public void cart() {
		
		//Scenario 6.1: checkout cart
		
		WebElement hover1=driver.findElement(By.xpath("(//b[contains(text(),'Cart')]"));
		Actions action=new Actions(driver);
		action.clickAndHold(hover1).build().perform();
		
		
		
		//("//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/p[2]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/p[2]/a[1]/span[1]")).click() ;   
		
	}

public void cart1() {
	WebElement hover1=driver.findElement(By.xpath("//b[contains(text(),'Cart')]"));
	Actions action=new Actions(driver);
	action.clickAndHold(hover1).build().perform();
	
	
	driver.findElement(By.xpath("//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/p[2]/a[1]/span[1]")).click();
	
	
}*/

	public void confirmorder() throws InterruptedException {
		
		//Scenario 6.2: checkout & check payment process" By payment Check"
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();  
		
		          
		driver.findElement(By.cssSelector("button[name='processAddress'] span")).click();
		
		
		driver.findElement(By.xpath("//input[@id='cgv']")).click();
		
		driver.findElement(By.cssSelector("button[name='processCarrier'] span")).click();
		driver.findElement(By.cssSelector("a[title='Pay by check.']")).click();

		
		
		driver.findElement(
				By.xpath("//span[normalize-space()='I confirm my order']")).click();
		
	}

}
