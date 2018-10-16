package com.qa.SeleniumProject;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	public WebDriver driver = null;
	
	@Before
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void AddUser() throws InterruptedException, IOException
	{
		driver.get("http://thedemosite.co.uk/addauser.php");
		UserPassInput userInfoPage = PageFactory.initElements(driver, UserPassInput.class);
		ReturnUserPass returnUserPass = PageFactory.initElements(driver, ReturnUserPass.class);
		Login login = PageFactory.initElements(driver, Login.class);
		
		userInfoPage.SubmitUser("John", "Doeson");
		
		driver.get("http://thedemosite.co.uk/login.php");
		
		login.SubmitUser("John", "Doeson");
		
		
		assertEquals("**Successful Login**", returnUserPass.getSearch().getText());
		
		
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
	
}
