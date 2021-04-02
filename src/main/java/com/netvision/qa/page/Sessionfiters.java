package com.netvision.qa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.netvision.qa.base.TestBase;

public class Sessionfiters extends TestBase{
	
	
	/*@FindBy(id="breadc0")
	private WebElement sessionWindow;*/
	
	public Sessionfiters() {
		PageFactory.initElements(driver,this);
		
	}
	
	public String verifySessionWindowTitle()
	{
		String titleTxt = driver.getTitle();
		System.out.println(titleTxt);
		return titleTxt;
	}
	
	public boolean verifySessionWindow()
	{
		
		WebDriverWait wait = new WebDriverWait(driver,30);
	    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("breadc0")));
		System.out.println("Gupta");
		boolean flag = element.isDisplayed();
		System.out.println("HH");
		return flag;
		
	}
	

}
