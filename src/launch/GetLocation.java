package launch;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		Thread.sleep(2000);
		WebElement loginbtn = driver.findElement(By.name("login"));
		
		//fetch location 
		
		Point location = loginbtn.getLocation();
		System.out.println(location);
		int x = location.getX();
		int y = location.getY();
		System.out.println(x);
		System.out.println(y);
		
		
		Thread.sleep(2000);
		driver.close();
		
	
	}

}
