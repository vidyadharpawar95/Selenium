package crio_Do;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_ex1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Crio Selenium\\Selenium_practice\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://crio-qkart-frontend-qa.vercel.app/");
		List<WebElement> tableHeaderElements=driver.findElements(By.xpath("//table//th"));
        for(int i=0;i<tableHeaderElements.size();i++){
        	System.out.println(i);
            }
        }
	}


