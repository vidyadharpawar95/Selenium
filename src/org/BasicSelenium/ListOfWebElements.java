package org.BasicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListOfWebElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Crio Selenium\\Selenium_practice\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		List<WebElement> firstName=driver.findElements(By.xpath("//div[@class='rt-td'][text()][1]"));
		for(char i=0;i<firstName.size();i++) {
			System.out.println(firstName.get(i).getText());
		}
		
	}

}
