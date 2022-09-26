package com.express.qa.testdata;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.express.qa.base.TestBase;
import com.express.qa.pages.HomePage;
import com.express.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homepage;
	
	public LoginPageTest() {
		
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		
		initialization();
		loginPage = new LoginPage();
	}
	
	
	@Test
	public void loginTest() throws InterruptedException {
		homepage = loginPage.Login("username", prop.getProperty("password"));
		Thread.sleep(4000);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
