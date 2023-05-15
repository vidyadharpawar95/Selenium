package window_Handling;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandleUsingForLoop2 {
	//In this program we have print both window ID'd and window titles of both page
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Crio Selenium\\Selenium_practice\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Set<String> multiWinHandling= driver.getWindowHandles();
		for(String win:multiWinHandling) {
			System.out.println("WindowID="+win);
			Thread.sleep(5000);
			String title=driver.switchTo().window(win).getTitle();
			System.out.println("Page titles="+title);
			if(title.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM"));
			
			driver.close();
		}

	}

}
