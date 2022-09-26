package com.express.qa.util;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.express.qa.base.TestBase;
import com.express.qa.pages.HomePage;
import com.express.qa.pages.LoginPage;

public class HomePageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homepage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		
		initialization();
		loginPage = new LoginPage();
		homepage = loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test
	public void verifyHomePageTitleTest() {
		homepage.verifyHomePageTitle();
	}
	
	@Test
	public void clickMenClothingPage() {
		homepage.clickOnmensclothing();
	
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
