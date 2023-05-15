package dropDownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_multiple_dd_genericMethod {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Crio Selenium\\Selenium_practice\\Driver\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/contact-sales/");
		driver.findElement(By.xpath("//input[@id='Form_getForm_FullName']")).sendKeys("Vidyadhar Pawar");
		driver.findElement(By.name("Contact")).sendKeys("7840949227");
		driver.findElement(By.xpath("//*[@id='Form_getForm_Email']")).sendKeys("idontknow@gmail.com");

		WebElement countrydd=driver.findElement(By.xpath("//*[@id='Form_getForm_Country']"));
		genericForMultipleDd(countrydd, "India");

		WebElement employeedd=driver.findElement(By.xpath("//*[@id='Form_getForm_NoOfEmployees']"));
		genericForMultipleDd(employeedd, "151 - 200");
	}
	
	public static void genericForMultipleDd(WebElement ele, String value) {
		Select sel = new Select(ele);
		List<WebElement> getoptions=sel.getOptions();
		for(int i=0; i<getoptions.size();i++) {
			if(getoptions.get(i).getText().equals(value)) {
				getoptions.get(i).click();
				break;
			}
		}


	}
}
