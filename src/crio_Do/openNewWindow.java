package crio_Do;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class openNewWindow {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Crio Selenium\\Selenium_practice\\Driver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver(options);
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.google.com/"); 
	    System.out.println(driver.getTitle());
	    
	    driver.switchTo().newWindow(WindowType.TAB);
	    
	    driver.get("https://www.facebook.com/");
	    System.out.println(driver.getTitle());
	  
	    Set<String> windows=driver.getWindowHandles();
	    List<String>handles=new ArrayList<String>();
	    handles.addAll(windows);
	    
	    driver.close();
	    driver.switchTo().window(handles.get(0));
	    System.out.println("TitleOfParentPage="+driver.getTitle());
	}

}
