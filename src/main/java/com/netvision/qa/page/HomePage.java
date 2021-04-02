package com.netvision.qa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.netvision.qa.base.TestBase;

public class HomePage extends TestBase {

	
	
@FindBy(xpath="//div[contains(text(),'Capacity')]")
 private WebElement verifyByAlertCapacity;

/*@FindBy(xpath="//div[text()=' View']")
private WebElement viewIcon;

@FindBy(xpath="//span[contains(text(),'Search')]")
private WebElement clickSearch;
*/

public HomePage() {
	PageFactory.initElements(driver,this);
}


public String verifyHomePageTitle()
{
	return driver.getTitle();
}



public boolean verifyLoginPage() {
	return verifyByAlertCapacity.isDisplayed();
	
}

public Sessionfiters clickViewButton() 
{
	
	
	WebDriverWait wait = new WebDriverWait(driver,30);
    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()=' View']")));
    element.click();
    //WebDriverWait wait1 = new WebDriverWait(driver,30);
    WebElement Search = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()=' View']")));
	Search.click();
	
	return new Sessionfiters();
	
}

	
}
