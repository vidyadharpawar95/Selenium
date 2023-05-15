package dropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Crio Selenium\\Selenium_practice\\Driver\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demoqa.com/select-menu");
    WebElement dropdown=driver.findElement(By.id("oldSelectMenu"));
    Select sel= new Select(dropdown);
    
    //sel.selectByVisibleText("Voilet"); //It will select the text from the DropDown.
    
    //sel.selectByValue("9"); // It will select that option where value 9 present.
    
    sel.selectByIndex(5); //it will not store in String , It is stored in int.
    
    
	}

}
