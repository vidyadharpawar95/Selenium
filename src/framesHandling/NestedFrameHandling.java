package framesHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NestedFrameHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Crio Selenium\\Selenium_practice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.switchTo().frame("frame1"); // switched parent frame
		driver.switchTo().frame("frame3"); // swithced child frame
		driver.findElement(By.id("a")).click();  //perform click operation on check box

		driver.switchTo().parentFrame();  // went back to parent frame

		driver.findElement(By.tagName("input")).sendKeys("this is frame"); //sendkeys on parent text box
		
        driver.switchTo().defaultContent(); //went back to defaultpage
        
		driver.switchTo().frame("frame2");  // switched on frame 2

		WebElement dropdown= driver.findElement(By.cssSelector("#animals"));
		Select sel = new Select(dropdown); 
		sel.selectByVisibleText("Baby Cat");
	}

}
