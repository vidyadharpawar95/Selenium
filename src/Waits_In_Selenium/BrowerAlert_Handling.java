package Waits_In_Selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowerAlert_Handling {

	public static void main(String[] args) {
		ChromeOptions option= new ChromeOptions();    //these two lines will handle the browers handle but we have to pass 
		option.addArguments("--disable-notifications"); //reference in WebDriver driver = new ChromeDriver(option);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Crio Selenium\\Selenium_practice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.facebook.com/");
		// driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("vidyadharpawar95@gmail.com");
		driver.findElement(By.xpath("//*[@name='pass']")).sendKeys("Vidya@123");
		driver.findElement(By.xpath("//*[@name='login']")).click();
	
	}

}
