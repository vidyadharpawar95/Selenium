package alert_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ex1 {
	public static void main(String[] args) throws InterruptedException {
		//alert handle with only ok button.
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Crio Selenium\\Selenium_practice\\Driver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver(options);
	    driver.manage().window().maximize();
	    driver.get("https://demoqa.com/alerts");
	    driver.findElement(By.xpath("//button[@id='alertButton']")).click();
	    Thread.sleep(5000);
	    driver.switchTo().alert().accept();

	}

}
