import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;

public class qstn8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String s="https://homehub.shinyapps.io/homehub/";
		driver.get(s);
		String title=driver.getTitle();
		System.out.println("URL entered :"+s);
		System.out.println("Length of URl entered :"+s.length());
		System.out.println("Title :"+title);
		System.out.println("Title Length :"+title.length());
		System.out.println("Current URL :"+driver.getCurrentUrl());
		System.out.println("Current URL :"+driver.getCurrentUrl().length());
		String a=driver.getCurrentUrl();
		if(s.equals(a))
		{
			System.out.println("Both url are same");
		}
		else
			System.out.println("Both url are not same");
		System.out.println(driver.getPageSource());
		System.out.println(driver.getPageSource().length());
		System.out.println(driver.getClass());
		
		
	}

}
