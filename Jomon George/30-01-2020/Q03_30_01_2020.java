package Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q03_30_01_2020 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String inputURL = "https://jpetstore.cfapps.io/"; 
		driver.get(inputURL);
		
		String s = driver.getTitle();
		System.out.println("WebPage Title : " + s);
		
		String currentURL = driver.getCurrentUrl();
		System.out.println("Current URL : " + currentURL);
		
		if(inputURL.equals(currentURL))
			System.out.println("The input URL and current URL are the same");
		else
			System.out.println("The input URL and current URL are not the same");
		
		String pgSource = driver.getPageSource();
		System.out.println("Length of Page Source : " + pgSource.length());
		
		System.out.println(driver.getClass());
		
		Thread.sleep(5000);
		driver.quit();
	}

}
