package webdriverdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prgm6_browsers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://jpetstore.cfapps.io/");
		String str="https://jpetstore.cfapps.io/";
		String s= driver.getTitle();
		System.out.println(s);
		System.out.println("title Length = " +s.length());
		String url= driver.getCurrentUrl();
		System.out.println(url);
		System.out.println("Length = " +url.length());
	if(str.equals(url))
	{
		System.out.println("same URL");
	}
	String ps= driver.getPageSource();
	System.out.println(ps);
	System.out.println("page Length = " +ps.length());
	Object pc=driver.getClass();
	System.out.println("class = "+pc);
	Thread.sleep(5000);
	driver.quit();
	}

}
