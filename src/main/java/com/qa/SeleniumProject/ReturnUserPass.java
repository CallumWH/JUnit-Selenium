package com.qa.SeleniumProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReturnUserPass{

	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")
	private WebElement softwareText;
	
	public WebElement getSearch() {
		return softwareText;
	}
}