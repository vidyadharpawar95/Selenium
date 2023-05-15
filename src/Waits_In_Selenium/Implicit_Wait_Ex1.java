package Waits_In_Selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicit_Wait_Ex1 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Crio Selenium\\Selenium_practice\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	String currentURL=driver.getCurrentUrl();
	System.out.println("URL of Page="+currentURL);
	String titleOfWebPage= driver.getTitle();
	System.out.println("title of Page="+titleOfWebPage);
	String htmlcode=driver.getPageSource();
	System.out.println("html code of Page="+htmlcode);

	}

}
