package org.BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class edge_startUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Crio Selenium\\Selenium_practice\\Driver\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
	    driver.get("https://www.google.com/");
		
	}

}
