package launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWrbElemets {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
WebDriver driver = new ChromeDriver();
Thread.sleep(2000);
driver.get("https://demoapps.qspiders.com/ui/?scenario=1");
Thread.sleep(2000);
driver.findElement(By.linkText("Check Box")).click();
Thread.sleep(2000);
WebElement emailwe = driver.findElement(By.id("domain1"));
Thread.sleep(2000);
System.out.println(emailwe.isEnabled()?"enabled":"disabled");
Thread.sleep(2000);
System.out.println(emailwe.isDisplayed()?"displayed":"no displayed");
Thread.sleep(2000);
System.out.println(emailwe.isSelected()?"selected":"not selected");
Thread.sleep(2000);
emailwe.click();
System.out.println(emailwe.isSelected()?"selected":"not selected");
Thread.sleep(2000);

driver.findElement(By.linkText("Disabled")).click();
Thread.sleep(2000);
WebElement emaildis=driver.findElement(By.id("domain2"));
Thread.sleep(2000);
	System.out.println(emaildis.isEnabled()?"enabled":"disabled");
	driver.close();
}
}
