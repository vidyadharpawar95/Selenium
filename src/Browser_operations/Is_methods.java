package Browser_operations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Is_methods {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Crio Selenium\\Selenium_practice\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver(option);
      driver.manage().window().maximize();
        driver.get("https://www.singaporeair.com/en_UK/in/home?ds_rl=1012408&gclid=CjwKCAiAlp2fBhBPEiwA2Q10DwDRXZtSa4bkfsTm087kfTntAg34liRlTuFbuzvEImSo1Dh80OLzxxoCO4AQAvD_BwE&gclsrc=aw.ds#/book/bookflight");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement ele=driver.findElement(By.xpath("//label[text()='Redeem flights']"));
        js.executeScript("arguments[0].scrollIntoView(true)",ele);
        Thread.sleep(5000);
        js.executeScript("arguments[0].click();",ele);
        Thread.sleep(2000);
        System.out.println(ele.isSelected());
	}

}
