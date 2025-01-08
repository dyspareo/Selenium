package launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext {
public static void main(String[] args) throws InterruptedException {
  System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
  WebDriver driver= new ChromeDriver();
  driver.get("https://www.google.co.in");
  Thread.sleep(2000);
  driver.findElement(By.linkText("Gmail")).click();
}
}
