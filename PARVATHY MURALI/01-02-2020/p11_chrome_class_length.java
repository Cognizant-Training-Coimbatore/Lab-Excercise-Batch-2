package webdriver_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p11_chrome_class_length 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		String s=driver.getTitle();//to get title...store
		System.out.println(s);
		Thread.sleep(3000);
		WebElement login=driver.findElement(By.linkText("Log in"));
		login.click();
		String s_current=driver.getTitle();
		System.out.println(s_current);
		int l_url=s.length(), l_current_url=s_current.length();
		System.out.println("Length of initial url:  "+l_url);
		System.out.println("Length of current url:  "+l_current_url);
		if(l_url==l_current_url)
		{
			System.out.println("both the inital url and current url are same in length");
		}
		else
		{
			System.out.println("both the inital url and current url are diffent in length");
		}
		
		driver.getClass();
		//System.out.println("page source:\n"+getName());
		String pagesource=driver.getPageSource();
		System.out.println("page source:\n"+pagesource);
		System.out.println("page class size: "+ pagesource.length());
		
		
		
		driver.quit();


	}

}
