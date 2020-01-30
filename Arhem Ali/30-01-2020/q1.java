package webdriverdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class q1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		WebElement login=driver.findElement(By.linkText("Log In"));
		login.click();
		String s=driver.getTitle();
		System.out.println(s);
		System.out.println("length title:"+s.length());
		Thread.sleep(3000);
		String u=driver.getCurrentUrl();
		System.out.println("current url: "+u);
		System.out.println("url length:"+u.length());
		String t="http://facebook.com";
		if(u==t)
		{
			System.out.println("same url");
		}
		else
		{
	
				System.out.println("different url");
		}
		String f=driver.getPageSource();
		System.out.println(f);
		System.out.println("length of src code: "+f.length());
		 Class<? extends WebDriver> i=driver.getClass();
		System.out.println("Current class: "+i);
		
		
		
		
		driver.quit();

	}

}
