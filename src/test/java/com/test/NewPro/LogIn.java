package com.test.NewPro;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LogIn {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp()
	
    { ProfilesIni profile = new ProfilesIni();
      FirefoxProfile pr= profile.getProfile("default");
		
		driver = new FirefoxDriver(pr);}
	
	@Test
	public void dologin()
	{ //driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");}

	@AfterSuite
	public void finish()
	{
		driver.quit();
	}
}