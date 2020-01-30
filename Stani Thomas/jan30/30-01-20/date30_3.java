package webdriverdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class date30_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	String s2="https://facebook.com";
		String s=driver.getTitle();
		int l=s.length();
		System.out.println(s);
		System.out.println("length = "+l);
		String s1=driver.getCurrentUrl();
		System.out.println(s1);
		int l1=s1.length();
		System.out.println("length of url = "+l1);
		if(s.equals(s2))
		{
			System.out.println("both are same");
		}
		else
		{
			System.out.println("both are not same");
		}
		String s3=driver.getPageSource();
		int l3=s3.length();
		System.out.println(s3);
		System.out.println("length = "+l3);
		Object g=driver.getClass();
		System.out.println("class : "+g);
		driver.quit();
	}

}
