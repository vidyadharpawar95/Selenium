package alert_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3 {
	public static void main(String[] args) throws InterruptedException {
		//confirmation alert here we have to accept it cancel it
		System.setProperty("webdriver.chrome.driver", "C:\\Crio Selenium\\Selenium_practice\\Driver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoqa.com/alerts");
	    WebElement alert= driver.findElement(By.id("confirmButton"));
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView(true)", alert);
	    alert.click();
	    Thread.sleep(5000);
	    driver.switchTo().alert().accept();
	    

	}

}
