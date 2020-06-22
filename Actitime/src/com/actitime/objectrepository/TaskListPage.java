package com.actitime.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
@FindBy(xpath="//div[.='Add New']")
private WebElement AddNewBtn;

@FindBy(xpath="//div[.='+ New Customer']")
private WebElement NewCustomerMenu;

@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
private WebElement EnterCustomerNameTBX;

@FindBy(xpath="//textarea[@placeholder='Enter Customer Description' ]")
private WebElement EnterCustomerDescriptionTBX;

@FindBy(xpath="//div[.='- Select Customer -'  and @class='emptySelection']")
private WebElement SelectCustomerDropDown;


@FindBy(xpath="//div[.='Our company' and @class='itemRow cpItemRow ']")
private WebElement OurCompanyText;


@FindBy(xpath="//div[.='Create Customer']")
private WebElement CreateCustomerPopUpBtn;

@FindBy(xpath="(//div[@class='title' and @title])[1]")
private WebElement VerifyCustomerNameCreated;

public WebElement getVerifyCustomerNameCreated() {
	return VerifyCustomerNameCreated;
}
public TaskListPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public WebElement getAddNewBtn() {
	return AddNewBtn;
}
public WebElement getNewCustomerMenu() {
	return NewCustomerMenu;
}
public WebElement getEnterCustomerNameTBX() {
	return EnterCustomerNameTBX;
}
public WebElement getEnterCustomerDescriptionTBX() {
	return EnterCustomerDescriptionTBX;
}
public WebElement getSelectCustomerDropDown() {
	return SelectCustomerDropDown;
}
public WebElement getOurCompanyText() {
	return OurCompanyText;
}
public WebElement getCreateCustomerPopUpBtn() {
	return CreateCustomerPopUpBtn;
}
}
