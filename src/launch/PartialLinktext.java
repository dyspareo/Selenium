package launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinktext {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.youtube.com/");
	    Thread.sleep(2000);
	    //pass email id and password
	    driver.findElement(By.className("ytSearchboxComponentInput")).sendKeys("Alone");
	    Thread.sleep(2000);
	    driver.findElement(By.className("ytSearchboxComponentSearchButton")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.partialLinkText("Marshmello - Alone")).click();
	}
}
