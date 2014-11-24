package com.test.automation.JenkinsDemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Linkedln {

	
	WebDriver driver;
	
	@Before
	public void openbrowser()
	{
	    driver=new FirefoxDriver();
		String Baseurl="http://www.Linkedln.com";
		driver.get(Baseurl);
		
		
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@After
	public void exit()
	{
		driver.quit();
	}

}
