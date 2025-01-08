package launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class passURL {

	 public static void main(String[] args) {
		//build path
		 System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	   //launch browser
		WebDriver driver = new ChromeDriver();
		String expectedURL ="https://www.flipkart.com";
		//pass the url
		driver.get(expectedURL);
		String actualURL= driver.getCurrentUrl();
		if(expectedURL.equals(actualURL))
		{
			System.out.println("url is matching");
		}
		else {
			System.out.println("url is not matching");
		}
		
		System.out.println(driver.getTitle());
//		System.out.println(driver.getPageSource());
	
//		driver.get("https://www.google.co.in"); 
		driver.close();
	 }
}
