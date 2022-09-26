package com.express.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.express.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(css="button[aria-label='Focus Close Modal']")
	WebElement closepopup;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[2]/div/div[3]/div[2]/div[1]/button")
	WebElement accountlink;
	
	@FindBy(css="input[aria-label='Email'][id='email']")
	WebElement signin;
	
	@FindBy(css="input[aria-label='Password'][id='password']")
	WebElement email;
	
	@FindBy(css="input[aria-label='Password'][id='password']")
	WebElement password;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);//we can write like(LoginPage.class)too instead this
	}
	
	public HomePage Login(String un, String pwd) {
		closepopup.click();
		accountlink.click();
		email.sendKeys(un);
		password.sendKeys(pwd);
		
		return new HomePage(null); 
	}
	

}
