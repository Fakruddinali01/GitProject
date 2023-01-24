package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	

	@FindBy(xpath = "//div[text()='Add New']")
	public WebElement addNewBtn;
	
	@FindBy(xpath = "//div[text()='+ New Customer']")
	public WebElement newCustOption;
	
	@FindBy(xpath = "//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	public WebElement enterCustNmtbx;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	public WebElement custDisptopt;
	
	@FindBy(xpath = "(//div[text()='- Select Customer -'])[1]")
	public WebElement selectDDbtn;

	@FindBy(xpath = "//div[text()='Our company' and @class='itemRow cpItemRow ']")
	public WebElement ourCompanyTx;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	public WebElement createCustBtn;
	
	@FindBy(xpath = "//div[@class='titleEditButtonContainer']/div[1]")
	public WebElement actualCustCreated;
	
	
	public TaskListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getAddNewBtn() {
		return addNewBtn;
	}
	public WebElement getNewCustOption() {
		return newCustOption;
	}
	public WebElement getEnterCustNmtbx() {
		return enterCustNmtbx;
	}
	public WebElement getCustDisptopt() {
		return custDisptopt;
	}
	public WebElement getSelectDDbtn() {
		return selectDDbtn;
	}
	public WebElement getOurCompanyTx() {
		return ourCompanyTx;
	}
	public WebElement getCreateCustBtn() {
		return createCustBtn;
	}
	public WebElement getActualCustCreated() {
		return actualCustCreated;
	}
	
}
