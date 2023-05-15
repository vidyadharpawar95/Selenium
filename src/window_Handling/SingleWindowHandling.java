package window_Handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Crio Selenium\\Selenium_practice\\Driver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        
        String singleWin= driver.getWindowHandle();
        
        String titleOFWebpage=driver.getTitle();
        
        System.out.println("ParentWindowID="+singleWin);
        System.out.println("TitleOfTheWebpage="+titleOFWebpage);
        
        Thread.sleep(2000);
        driver.close();
       
        
	}

}
