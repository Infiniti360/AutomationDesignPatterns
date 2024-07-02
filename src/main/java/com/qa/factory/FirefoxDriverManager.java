package com.qa.factory;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager extends DriverManager {
	public FirefoxDriverManager() {
		driver = new FirefoxDriver();
	}
}
