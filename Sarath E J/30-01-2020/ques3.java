package webdriverdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ques3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com/");
		String str = "http://gmail.com/";
		String s = driver.getTitle();
		System.out.println(str);
		int n = str.length();
		System.out.println("Length of the url is : "+n);
		System.out.println("The url is : "+driver.getCurrentUrl());
		int a =driver.getCurrentUrl().length();
		System.out.println("Length of the url is : "+a);
		if(n==a)
		{
			System.out.println("Both have the same length ");
		}
		else
		{	
			
			System.out.println( driver.getClass());
			String st = driver.getPageSource();
			System.out.println(st);
			System.out.println("The length of the page source is : "+str.length());
		}
		
		driver.quit();

	}

}
