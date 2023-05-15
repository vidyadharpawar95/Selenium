package alert_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2 {
	public static void main(String[] args) throws InterruptedException {
		//alert will appeared after 5 seconds
		System.setProperty("webdriver.chrome.driver", "C:\\Crio Selenium\\Selenium_practice\\Driver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoqa.com/alerts");
	    driver.findElement(By.xpath("(//button[text()='Click me'])[2]")).click();
	    Thread.sleep(5000);
	    driver.switchTo().alert().accept();

	}

}
