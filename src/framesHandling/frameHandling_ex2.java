package framesHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameHandling_ex2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Crio Selenium\\Selenium_practice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		
	   int sizeOfIframes=driver.findElements(By.tagName("iframe")).size();
	   System.out.println("No of iframes="+sizeOfIframes);
	   
	   
	//   WebElement frame= driver.findElement(By.id("frame1"));
	  
	   driver.switchTo().frame("frame1");
	   String text=driver.findElement(By.id("sampleHeading")).getText();
	   System.out.println("second frame="+text);
//Note- we cannot switch directly to another frame 1st we have go back to previous frame and the we can switch 2nd frame. 
	   driver.switchTo().defaultContent();
	   
	   driver.switchTo().frame("frame2");
	   String frame2=driver.findElement(By.id("sampleHeading")).getText();
	   System.out.println("second frame="+frame2);

	}

}
