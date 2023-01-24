package com.actitime.pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.BaseClass;


public class HomePage extends BaseClass {


	@FindBy(id="logoutLink")
	private WebElement lgout;
	
	@FindBy(xpath="//div[@id='container_tasks']")
	private WebElement taskTab;
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	}
	
	public void setLogout() {
		lgout.click();
	}
	public void setTaskTab() {
		taskTab.click();
	}
	
}
