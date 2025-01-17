package launch;

import org.openqa.selenium.Rectangle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectangle {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://facebook.com");
	Thread.sleep(2000);
	WebElement loginbtn = driver.findElement(By.name("login"));
	 Rectangle rect = loginbtn.getRect();
	 
	 int width = rect.getWidth();
	 int height = rect.getHeight();
	 int x = rect.getX();
	 int y = rect.getY();
	 System.out.println(width);
	 System.out.println(height);
	 System.out.println(x);
	 System.out.println(y);
	 
	 driver.close();
	
}
}
