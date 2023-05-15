package crio_Do;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class openNewWindow2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\Crio Selenium\\Selenium_practice\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://crio-qkart-frontend-qa.vercel.app/"); 


		WebElement privacyPolicy= driver.findElement(By.linkText("Privacy policy"));
		privacyPolicy.click();

		Set<String> windows=driver.getWindowHandles();
		List<String>handles= new ArrayList<String>();
		handles.addAll(windows);

		driver.switchTo().window(handles.get(1));
		WebElement TitlePrivacy=driver.findElement(By.tagName("h2"));
		System.out.println(TitlePrivacy.getText());
	
	
		WebElement termsOfServices= driver.findElement(By.linkText("Terms of Service"));
		termsOfServices.click();
		System.out.println(termsOfServices.getText());
		
		
		driver.switchTo().window(handles.get(0));
		System.out.println(driver.getTitle());
	}
}