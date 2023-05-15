package Auto_IT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ImgUpload {

	public static void main(String[] args) throws IOException {
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		System.setProperty("webdriver.chrome.driver", "C:\\Crio Selenium\\Selenium_practice\\Driver\\chromedriver.exe");
		driver.get("https://demoqa.com/automation-practice-form");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement imgUplaod= driver.findElement(By.id("uploadPicture"));
		js.executeScript("arguments[0].scrollIntoView(true)", imgUplaod);
		Actions act = new Actions(driver);
		act.moveToElement(imgUplaod).click().perform();
		Runtime.getRuntime().exec("C:\\Users\\vidya\\Downloads\\AutoIT\\fileupload.exe");

	}

}
