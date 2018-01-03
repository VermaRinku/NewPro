package com.test.NewPro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class base {
	@Test
	public void a()
	{
		System.out.println("Hello");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
	}

}
