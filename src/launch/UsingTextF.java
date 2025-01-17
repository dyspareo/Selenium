package launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingTextF {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoapps.qspiders.com/ui/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[.='Button']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[.='Yes']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("btn3")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[.='5']")).click();
	Thread.sleep(2000);
	driver.close();
	
}
}
