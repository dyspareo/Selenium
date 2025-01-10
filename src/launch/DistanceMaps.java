package launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DistanceMaps {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/maps/@10.0070517,76.3058323,14z?entry=ttu&g_ep=EgoyMDI1MDEwNy4wIKXMDSoASAFQAw%3D%3D");
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("Mumbai");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id='searchbox-searchbutton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='g88MCb S9kvJb ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class='tactile-searchbox-input']")).sendKeys("Kerala");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='mL3xi']")).click();

	}
}
