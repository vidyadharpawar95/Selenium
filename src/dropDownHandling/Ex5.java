package dropDownHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex5 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Crio Selenium\\Selenium_practice\\Driver\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    
    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");  //username filled
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123"); // password filled
    driver.findElement(By.xpath("//button[@type='submit']")).click();  //login button
    driver.findElement(By.xpath("//*[@class='oxd-userdropdown-tab']")).click(); //dropdown element
    
    List<WebElement>alloptions= driver.findElements(By.xpath("//ul[@class='oxd-dropdown-menu']//a")); //inside that dd element
    System.out.println(alloptions.size());
    for(int i=0; i<alloptions.size();i++) {
    	if(alloptions.get(i).getText().equals("Support")) {
    		alloptions.get(i).click();
    		break;
    	}
    }
	}
	//ul[@class='oxd-dropdown-menu']//a
}
