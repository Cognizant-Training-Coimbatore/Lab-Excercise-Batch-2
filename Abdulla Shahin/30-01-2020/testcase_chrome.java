import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase_chrome {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String s = driver.getTitle();
		int title_length = s.length();
		String cur_url = driver.getCurrentUrl();
		int length_cur_url = cur_url.length();
		String pageSource = driver.getPageSource(); 
		int pg_s_length = pageSource.length();
		System.out.println("title:"+s);
		System.out.println("title length:" +title_length);
		System.out.println("current url:"+cur_url);
		System.out.println(length_cur_url);
		if (cur_url.equals("https://www.facebook.com/"))
		{  
			System.out.println("Verification Successful - The correct Url is opened.");  
		}  
		else
		{  			  
			System.out.println("Verification Failed - An incorrect Url is opened.");  
		}  
		System.out.println("page source length:"+pg_s_length);
	}

}
