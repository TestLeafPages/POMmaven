package com.autoBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.autoBot.testng.api.base.Annotations;

public class LoginPage extends Annotations{ 

	public LoginPage() {
		PageFactory.initElements(driver, this); 
	}
	@CacheLookup
	@FindBy(how=How.ID, using="username") 
	WebElement eleUserName;
	@FindBy(how=How.ID, using="password") 
	WebElement elePassWord;
	@FindBy(how=How.CLASS_NAME, using="decorativeSubmit") 
	WebElement eleLogin;

	public LoginPage enterUserName(String data) {
		clearAndType(eleUserName, data);  
		return this; 
	}
	public LoginPage enterPassWord(String data) {
		clearAndType(elePassWord, data); 
		return this; 
	}
	public HomePage clickLogin() {
		click(eleLogin);  
		return new HomePage();
	}
}


