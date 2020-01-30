package webdriverdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bigprogram {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		String title=driver.getTitle();
		System.out.println(title);
		int length=title.length();
		System.out.println("length is : "+length);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		System.out.println("url length :"+url.length());
		if(url=="http://facebook.com")
		{
			System.out.println("both are same");
		}
		else
		{
			System.out.println("different");
		}
		Class<? extends WebDriver> cls=driver.getClass();
		System.out.println("class is  : "+cls);
		
		
		WebElement st=driver.findElement(By.linkText("Log In"));
		st.click();
		String source=driver.getPageSource();
		int slength=source.length();
		System.out.println("source length :  "+slength);
		System.out.println(source);
		driver.quit();
		

	}

}
