package com.netvision.qa.page;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.netvision.qa.base.TestBase;

public class LoginPage extends TestBase{

	
	//Object Repository
	
	@FindBy(xpath="//input[@placeholder='User Name']")
	private WebElement usrNametxt;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement passWord;
	
	@FindBy(id="login-button")
	private WebElement clickLogInButton;
	
	@FindBy(xpath="//h2[contains(text(),'NetVision')]")
	private WebElement netVisionLogo;
	
	
	//initializing the page object
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	//Actions
	
	public boolean validateNetvisionLogo()
	{
		return netVisionLogo.isDisplayed();
	}
	
	public HomePage login(String un,String pwd)
	{
		usrNametxt.sendKeys(un);
		passWord.sendKeys(pwd);
		clickLogInButton.click();
		try{
	         
	        new WebDriverWait(driver, 10).until(ExpectedConditions.alertIsPresent());
	     
	    driver.switchTo().alert().accept(); 
	    
	      } catch(Exception e ){ 
	}
		
		
		return new HomePage();
	}
}
