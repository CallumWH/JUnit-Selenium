package com.qa.SeleniumProject;


import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Unit test for simple App.
 */
public class Painter 
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
		driver.get("https://www.youidraw.com/apps/painter/");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		
		
		action.moveByOffset(650, 240);
		action.clickAndHold();
		action.moveByOffset(-100, 240);
		action.moveByOffset(100, -240);
		action.moveByOffset(100, 240);
		action.moveByOffset(-50, -120);
		action.moveByOffset(-100, 0);
		action.release();
		
		action.moveByOffset(150, 120);
		action.clickAndHold();
		action.moveByOffset(0, -240);		
		action.moveByOffset(100, 0);
		action.moveByOffset(0, 120);
		action.moveByOffset(-100, 0);
		action.moveByOffset(100, 120);
		action.release();
		
		action.moveByOffset(50, 0);
		action.clickAndHold();
		action.moveByOffset(0, -240);
		action.moveByOffset(100, 0);
		action.moveByOffset(0, 240);
		action.moveByOffset(-100, 0);
		action.release();
		
		action.moveByOffset(150, 0);
		action.clickAndHold();
		action.moveByOffset(0, -240);
		action.moveByOffset(100, 240);
		action.moveByOffset(0, -240);
		action.release();
		
		
		
		action.perform();
		
		Thread.sleep(20000);
		
		action.moveByOffset(100, 200);
		action.moveByOffset(100, -200);
		
		
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
	
}
