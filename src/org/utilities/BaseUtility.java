package org.utilities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseUtility {
	WebDriver driver;
	public void waitTillElementIsToBeClickable(WebDriver driver, Duration sec) {
		WebDriverWait wait= new WebDriverWait(driver, sec);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(null)));
	}
	public void waitTillElementIsToBeSelected(WebDriver driver, Duration sec) {
		WebDriverWait wait= new WebDriverWait(driver, sec);
		wait.until(ExpectedConditions.elementToBeSelected(By.xpath(null)));
	}
	public void waitTillAlertIsPresent(WebDriver driver, Duration sec) {
		WebDriverWait wait= new WebDriverWait(driver, sec);
		wait.until(ExpectedConditions.alertIsPresent());
	}
	public void selectByVisibleText(WebElement ele, String value) {
		Select sel=new Select(ele);
		sel.selectByVisibleText(value);
	}
	public void selectByValue(WebElement ele, String value) {
		Select sel=new Select(ele);
		sel.selectByValue(value);
	}
	public void selectByIndex(WebElement ele, int value) {
		Select sel=new Select(ele);
		sel.selectByIndex(value);
	}
	public static void selectOptionFromDropDown(List<WebElement> options, String value) {
		for(WebElement option:options) {
			if(option.getText().equals(value)) {
				option.click();
				break;
			}
		}
	}
	public WebDriver start_Up(String browserName, String url){
		if(browserName.equalsIgnoreCase("ch")|| browserName.equalsIgnoreCase("chrome") ) 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Crio Selenium\\Selenium_practice\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		if(browserName.equalsIgnoreCase("ff")|| browserName.equalsIgnoreCase("firefox") ) 
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Crio Selenium\\Selenium_practice\\Driver\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
		if(browserName.equalsIgnoreCase("edge")|| browserName.equalsIgnoreCase("msedge") ) 
		{
			System.setProperty("webdriver.edge.driver", "C:\\Crio Selenium\\Selenium_practice\\Driver\\msedgedriver.exe");
			driver=new EdgeDriver();
			driver.manage().window().maximize();
		}
		
		driver.get(url);
		return driver;
	}

	
}
