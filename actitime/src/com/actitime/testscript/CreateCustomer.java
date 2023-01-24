package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CreateCustomer extends  BaseClass{
	@Test
	public void toTestCreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Reporter.log("CreateCustomer",true);
		
		FileLib f=new FileLib();
String expectedCustName = f.getExcelData("CreateCustomer", 1, 2);		
String CustomerDescript = f.getExcelData("CreateCustomer", 1, 3);
HomePage h=new HomePage(driver);
h.setTaskTab();
TaskListPage t=new TaskListPage(driver);
//Thread.sleep(3000);
t.getAddNewBtn().click();
//Thread.sleep(3000);
t.getNewCustOption().click();
//Thread.sleep(3000);
t.getEnterCustNmtbx().sendKeys(expectedCustName);
//Thread.sleep(3000);
t.getCustDisptopt().sendKeys(CustomerDescript);
//Thread.sleep(3000);
t.getSelectDDbtn().click();
//Thread.sleep(3000);
t.getOurCompanyTx().click();
//Thread.sleep(3000);
t.getCreateCustBtn().click();
Thread.sleep(5000);
String actualtext = t.getActualCustCreated().getText();
 SoftAssert s=new SoftAssert();
Assert.assertEquals(actualtext, expectedCustName);
s.assertAll();
	}

}
