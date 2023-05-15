package Browser_operations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Is_methods3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Crio Selenium\\Selenium_practice\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/radio-button");
        WebElement ele=driver.findElement(By.xpath("//input[@id='impressiveRadio']"));
        Thread.sleep(4000);
//        JavascriptExecutor js=(JavascriptExecutor)driver;
//        js.executeScript("arguments[0].click()", ele);
        Actions act=new Actions(driver);
        act.moveToElement(ele).click().perform();
        System.out.println("slected status="+ele.isSelected());
        System.out.println("display status="+ele.isDisplayed());
        System.out.println("enable status="+ele.isEnabled());
	}

}
