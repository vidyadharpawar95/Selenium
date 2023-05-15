package org.BasicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.utilities.BaseUtility;

public class Basic_Sel_ex1 {

	public static void main(String[] args) {
		BaseUtility obj = new BaseUtility();
		WebDriver driver=obj.start_Up("ch", "https://www.youtube.com/");
		WebElement key=driver.findElement(By.xpath("//input[@id='search']"));
		key.sendKeys("Sdet Pavan Kumar");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//*[@class='style-scope ytd-searchbox'])[7]")).click();
		System.out.println("Tile of the page="+driver.getTitle());
		System.out.println("URL="+driver.getCurrentUrl());
	
	}

}
