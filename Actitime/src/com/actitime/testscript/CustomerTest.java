package com.actitime.testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.objectrepository.HomePage;
import com.actitime.objectrepository.TaskListPage;
/**
 * 
 * @author Sandeep
 *
 */
public class CustomerTest extends BaseClass{
	/**
	 * @throws IOException 
	 * 
	 */
@Test
public void testCreateCustomer() throws IOException {
	String CustomerName = f.getExcelValue("CreateCustomer", 1, 0);
	String CustomerDes = f.getExcelValue("CreateCustomer", 1, 1);
	HomePage h=new HomePage(driver);
	//click on Task menu
	h.getTaskMenu().click();
	//click on Add new button
	TaskListPage tl=new TaskListPage(driver);
	//click on add new button
     tl.getAddNewBtn().click();
     //click on new customer menu
     tl.getNewCustomerMenu().click();
     //Enter the customername
     tl.getEnterCustomerNameTBX().sendKeys(CustomerName);
     //enter the customer description
     tl.getEnterCustomerDescriptionTBX().sendKeys(CustomerDes);
     //click on select customer drop down
     tl.getSelectCustomerDropDown().click();
     //select our company in the menu
     tl.getOurCompanyText().click();
     //click on create customer
     tl.getCreateCustomerPopUpBtn().click();
     
     //verify wether customer is created successfully or not
     String ActualText = tl.getVerifyCustomerNameCreated().getText();
     Assert.assertEquals(ActualText, CustomerName);
}
}
