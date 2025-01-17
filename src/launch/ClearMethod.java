package launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://facebook.com");
	Thread.sleep(2000);
	WebElement emailfield = driver.findElement(By.id("email"));
	
	emailfield.sendKeys("sanjo@gmail.com");
	Thread.sleep(2000);
	emailfield.clear();
	
	Thread.sleep(2000);
	driver.close();
	
	
}
}
