package alert_handling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ex4 {
	public static void main(String[] args) throws InterruptedException {
		//alert handling with sendkeys
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Crio Selenium\\Selenium_practice\\Driver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver(options);
	    driver.manage().window().maximize();
	    driver.get("https://demoqa.com/alerts");
	    WebElement alert= driver.findElement(By.id("promtButton"));
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView(true)", alert);
	    alert.click();
	    Thread.sleep(5000);
	  
	    Alert alt= driver.switchTo().alert();
	    alt.sendKeys("vidyadhar pawar");
	    alt.accept();
	    

	}

}
