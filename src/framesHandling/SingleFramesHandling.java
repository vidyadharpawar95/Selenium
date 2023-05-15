
 package framesHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleFramesHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Crio Selenium\\Selenium_practice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");

		//we will get how many frames available in webpage
		int iframes=driver.findElements(By.tagName("iframe")).size();
		System.out.println("No of iframes present="+iframes);

		// 1st we have switch on the frame and then will move inside that frame;
		//there are 3 ways to handle the frames 1)webElement 2)by using index  3) id's or name's string

		//	1)by using webelement
		//		WebElement iframe= driver.findElement(By.id("moneyiframe"));
		//		driver.switchTo().frame(iframe);
		
		//2)by using index
        // driver.switchTo().frame(0);
         
         //3) id's or name's string
		driver.switchTo().frame("moneyiframe");
		
		String nseText= driver.findElement(By.id("nseindex")).getText();
		System.out.println(nseText);
	}

}
