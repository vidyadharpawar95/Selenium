package dropDownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownByUsingGetOption {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdrievr.chrome.driver", "C:\\Crio Selenium\\Selenium_practice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		WebElement dd = driver.findElement(By.id("oldSelectMenu"));
		Select sel = new Select(dd);
		List<WebElement> ddoptions = sel.getOptions();   //get option will return list webelement
		int size = ddoptions.size();
		for (int i = 0; i < size; i++) {
			System.out.println(ddoptions.get(i).getText());
			if (ddoptions.get(i).getText().equals("Yellow")) {
				sel.selectByVisibleText("Yellow");
				break;
				
			}
		}
		Thread.sleep(2000);
		driver.close();
	}
}
