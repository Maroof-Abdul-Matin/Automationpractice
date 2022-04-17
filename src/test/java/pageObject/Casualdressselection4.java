package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Casualdressselection4 {
	WebDriver driver;

	public Casualdressselection4(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void dresstype_casualdress() throws InterruptedException {
		
		//Scenario 4.1: selecting casual dress option
		
		WebElement hover= driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));

        Actions action=new Actions(driver);
        action.clickAndHold(hover).build().perform();
       
        Thread.sleep(2000);
        
         driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[2]")).click();
     
	}

	public void dressaddtocart() throws InterruptedException {
		
		//Scenario 4.2: Adding Casual dress in Cart

		WebElement hover = driver.findElement(By.className("product-container"));
		Actions action = new Actions(driver);
		action.clickAndHold(hover).build().perform();
	
		driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@title='Continue shopping']//span[1]")).click();
		
	
	}
	

}
