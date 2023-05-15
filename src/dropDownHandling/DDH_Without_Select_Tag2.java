package dropDownHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DDH_Without_Select_Tag2 {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Crio Selenium\\Selenium_practice\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewLeaveList");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin"); //username
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123"); // password
		driver.findElement(By.xpath("//*[@type='submit']")).click();  //log in button
		
		WebElement ddWithoutSel=driver.findElement(By.xpath("(//*[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]"));
		ddWithoutSel.click(); //clicked on Admin
		
        driver.findElement(By.xpath("//*[text()='Organization ']")).click();
        
		List<WebElement>orginization=driver.findElements(By.xpath("//ul[@class='oxd-dropdown-menu']/li"));
		
		System.out.println("List of orginization size="+orginization.size());
		
		for(WebElement ptype:orginization) {
			if(ptype.getText().equals("Locations")) {
				ptype.click();
				break;
			}
		}
	}

}
