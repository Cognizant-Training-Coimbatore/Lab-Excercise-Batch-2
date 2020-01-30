package exercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com/");
		String s = driver.getTitle();
		int n = s.length();
		System.out.println("Title : " + s);
		System.out.println("Title length : " + n);
		System.out.println("Current URL : " + driver.getCurrentUrl());
		int a = driver.getCurrentUrl().length();
		System.out.println("Current URL length: " + a);
		if(n==a)
		{
			System.out.println("both have the same length");
		}
		else
		{
			System.out.println(driver.getClass());
			String str = driver.getPageSource();
			System.out.println(str);
			System.out.println("The length of the page source is : " + str.length());
		}
		driver.quit();
	}

}
