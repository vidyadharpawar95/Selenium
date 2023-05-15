package window_Handling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Crio Selenium\\Selenium_practice\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.cssSelector("#tabButton")).click();
		Set<String> winID= driver.getWindowHandles();
		
		//1) we can handle multiple window by using Iterator
		/*Iterator<String> itr=winID.iterator();
		String parentwinID= itr.next();
		String ChildwinID= itr.next();
		System.out.println("ParentID="+parentwinID);
		System.out.println("ChildwinID="+ChildwinID);
		String titleOfWebPage=driver.switchTo().window(parentwinID).getTitle();
		System.out.println("pageTitle="+titleOfWebPage);
		*/
		//1) we can handle multiple window by for each loop
		for(String mulwinID:winID) {
			
			String pageTitle=driver.switchTo().window(mulwinID).getTitle();
			System.out.println(pageTitle);
		}
	}

}
