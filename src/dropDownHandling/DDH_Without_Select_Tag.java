package dropDownHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.Select;

public class DDH_Without_Select_Tag {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Crio Selenium\\Selenium_practice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.bstackdemo.com/");
		 driver.findElement(By.xpath("//select")).click();  
		 List<WebElement> allOptions=driver.findElements(By.cssSelector("select option"));


         for(int i=0; i<allOptions.size(); i++) {
            if(allOptions.get(i).getText().contains("Highest to lowest")) {
                     allOptions.get(i).click();
                     System.out.println("clicked");
                     break;
               }

         }
	}

}
