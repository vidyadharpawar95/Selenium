package crio_Do;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.util.internal.SystemPropertyUtil;

public class Static_webtable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Crio Selenium\\Selenium_practice\\Driver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    driver.get("https://web-locators-static-site-qa.vercel.app/Web%20Table");
	    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
	   List<WebElement>header=driver.findElements(By.xpath("//*[@class='MuiTableCell-root MuiTableCell-head MuiTableCell-alignLeft MuiTableCell-sizeMedium table heading css-1bigob2']"));
	   for(int i=0;i<header.size();i++) {
		   System.out.println(header.get(i).getText());
	   }
	   List<WebElement> listOf2ndRow= driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/table/tbody/tr[2]/td"));
	 for(int i=0;i<listOf2ndRow.size();i++) {
		 System.out.println(listOf2ndRow.get(i).getText());
	 }
	
	}

}
