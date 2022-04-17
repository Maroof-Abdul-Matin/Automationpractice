package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Tshirt5 {
	WebDriver driver;
	public Tshirt5(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void tshirt() {
		
		//Scenario 5.1: Selecting T-Shirt option
		
		driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]")).click();
		
		
	}
	
	public void shirtselect() throws InterruptedException {
		
		//Scenario 5.2: Filtering with blue color & Adding T-shit to Cart
		
		//Filtering with blue color
		driver.findElement(By.xpath("//input[@id='layered_id_attribute_group_14']")).click();
		
		
		WebElement hover= driver.findElement(By.className("product-container"));

        Actions action=new Actions(driver);
        action.clickAndHold(hover).build().perform();
      
        
        
        driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']")).click();
        
      
        
     
	
	}
	
	
	
	
	
	
}
