package com.qa.SeleniumProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPassInput 
{
	@FindBy(name = "username")
	private WebElement userName;
	
	@FindBy(name = "password")
	private WebElement password;
	
	@FindBy(name = "FormsButton2")
	private WebElement submitButton;
	
	public void SubmitUser(String user, String pass) throws InterruptedException 
	{
		userName.sendKeys(user);
		password.sendKeys(pass);
		submitButton.click();
		
	}
}
