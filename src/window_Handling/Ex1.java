package window_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Crio Selenium\\Selenium_practice\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		
		String winID= driver.getWindowHandle();
		
		System.out.println("parent window ID="+winID);
		
		String titleOfPage= driver.switchTo().window(winID).getTitle();
		System.out.println(titleOfPage);
	}

}
