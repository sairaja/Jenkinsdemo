package com.test.automation.JenkinsDemo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookAutomation {

	
	WebDriver driver;
	@Before
	public void openbrowser()
	{
		WebDriver driver=new FirefoxDriver();
		String Baseurl="http://www.Facebook.com";
		driver.get(Baseurl);
		
		
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	public void exit()
	{
		driver.quit();
	}

}
