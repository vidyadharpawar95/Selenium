package org.BasicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_hyperLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Crio Selenium\\Selenium_practice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		List<WebElement>list= driver.findElements(By.xpath("//a[@href]"));
		System.out.println(list.size());
		for(WebElement ele: list) {
			System.out.println("Name of links on googlePage="+ele.getText());
		}
	}

}
