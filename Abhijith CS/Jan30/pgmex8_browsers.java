package webdriverdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgmex8_browsers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jpetstore.cfapps.io/");
		String str = "https://jpetstore.cfapps.io/";
		String s = driver.getTitle();
		System.out.println(s);
		System.out.println("Title Lenght: "+s.length());
		String url = driver.getCurrentUrl();
		System.out.println(url);
		System.out.println("Lenght: "+url.length());
		if(str.equals(url));
		{
			System.out.println("Same url");
		}
		String ps= driver.getPageSource();
		
		System.out.println(ps);
		System.out.println("Page Source Lenght: "+ps.length());
		Object pc = driver.getClass();
		System.out.println("Class: "+pc);
		Thread.sleep(3000);
		driver.quit();
	}

}
