package com.test.automation.JenkinsDemo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailAutomation {

	
	WebDriver driver;
	@Before
	public void openbrowser()
	{
		WebDriver driver=new FirefoxDriver();
		String Baseurl="http://www.gmail.com";
		driver.get(Baseurl);
		
		
	}
	
	@Test
	public void test() {
	System.out.println("Finally done");
	}

	public void exit()
	{
		driver.quit();
	}
}
