package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.baseclass;
import pageObject.Casualdressselection4;
import pageObject.Homepage1;
import pageObject.Login3;
import pageObject.Myaccountsignout7;
import pageObject.Payment6;
import pageObject.Registration2;
import pageObject.Tshirt5;

public class Alltestcase {
	baseclass base = new baseclass();
	WebDriver driver = base.setDriver();
	Homepage1 homepage = new Homepage1(driver);
	Login3 loginRegistration = new Login3(driver);
	Registration2 registration = new Registration2(driver);
	Myaccountsignout7 myaccount = new Myaccountsignout7(driver);
	Casualdressselection4 casualdressselection = new Casualdressselection4(driver);
	Tshirt5 tshirt = new Tshirt5(driver);
	Payment6 payment = new Payment6(driver);

	String email1 = "maroof122333@gmail.com";
	String email2 = "maroof122334443@gmail.com";

	@Test(priority = 0)
	public void registrationcomplete() throws InterruptedException {

		homepage.signinclick();
		registration.creataccount(email1);
		registration.registration();
		myaccount.signout();
	}

	@Test(priority = 1)
	public void registrationcomplete2() throws InterruptedException {

		homepage.signinclick();
		registration.creataccount(email2);
		registration.registration();
		myaccount.signout();
	}

	@Test(priority = 2)
	public void login() throws InterruptedException {
		homepage.signinclick();
		loginRegistration.signin(email1);
		
		casualdressselection.dresstype_casualdress();
		casualdressselection.dressaddtocart();
		tshirt.tshirt();
		tshirt.shirtselect();
		
		payment.confirmorder();
		myaccount.signout();

	}

	@Test(priority = 3)
	public void login2() throws InterruptedException {
		homepage.signinclick();
		loginRegistration.signin(email1);
		casualdressselection.dresstype_casualdress();
		casualdressselection.dressaddtocart();
		tshirt.tshirt();
		tshirt.shirtselect();
		
		payment.confirmorder();
		myaccount.signout();
		

	}
}
