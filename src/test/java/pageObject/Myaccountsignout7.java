package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Myaccountsignout7 {
	WebDriver driver;
	public Myaccountsignout7(WebDriver driver) {
		this.driver=driver;
	}
	public void signout() {
		
		//Scenario 7 :after completing payment signing out
		
		//driver.findElement(By.xpath("//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")).click();
		driver.findElement(By.cssSelector("a[title='Log me out']")).click();
	}
	
	
	
	
	
	
	
	
	
}
