package launch;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
   Thread.sleep(2000);
   driver.close();
	
}
}
