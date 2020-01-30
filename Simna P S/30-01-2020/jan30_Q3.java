package exercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jan30_Q3 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String str = "https://www.gmail.com/";
		driver.get("https://www.gmail.com/");
		String s = driver.getTitle();
		System.out.println(s);
		System.out.println("title length: "+s.length());
		System.out.println("current url: "+driver.getCurrentUrl());
		
		System.out.println("length of current url: "+driver.getCurrentUrl().length());
		if(str.length()==driver.getCurrentUrl().length())
		{
			System.out.println("current url and actual url have the same length.");
		}
		else
		{
			System.out.println(driver.getClass());
			System.out.println(driver.getPageSource());
			System.out.println("the length od the page source: "+driver.getPageSource().length());
		}
		driver.quit();

	}

}
