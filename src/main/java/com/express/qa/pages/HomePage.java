package com.express.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.express.qa.base.TestBase;

public class HomePage extends TestBase {
	
	public static WebDriver driver; 
	
	@FindBy(css="button[aria-label='Focus Close Modal']")
	WebElement closepopup;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[2]/nav/ol/li[2]/a")
	WebElement mensclothing;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[2]/nav/ol/li[1]/a")
	WebElement womensclothing;
	
	@FindBy(xpath="//a[text()='Jeans'][@data-menu-index='2']")
	WebElement jeans;
	
	@FindBy(xpath="//a[text()='New']")
	WebElement newpage;
	
	@FindBy(xpath="//a[text()='Sale']")
	WebElement salepage;
	
	
	public HomePage(WebDriver driver) {
		HomePage.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public HomePage clickOnclosepopup() {
		closepopup.click();
		return new HomePage(driver);
	}
	
	public MenClothingPage clickOnmensclothing() {
		mensclothing.click();
		return new MenClothingPage();
	}
	
	public WomenClothingPage clickOnwomensclothing() {
		womensclothing.click();
		return new WomenClothingPage();
	}
	
	public JeansPage clickOnJeansPage() {
		jeans.click();
		return new JeansPage();
	}
	
	public SalePage clickOnSalePage() {
		jeans.click();
		return new SalePage();
	}
	
	
	

}
