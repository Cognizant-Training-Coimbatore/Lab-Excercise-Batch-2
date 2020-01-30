import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase_chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://fb.com");
		String s=driver.getTitle();
		int pagelength=s.length();
		String currentURL = driver.getCurrentUrl();
		int length=currentURL.length();
		String pageSource = driver.getPageSource();  
		int l=pageSource.length();
		System.out.println(s);
		System.out.println("Title length " + pagelength);
		System.out.println("Current url " + currentURL);
		System.out.println("Current url length " + length);
		   
		if (currentURL.equals("http://fb.com")) 
		{  
		System.out.println("Verification Successful - The correct Url is opened.");  
		}  
		else
		{  
		  
		System.out.println("Verification Failed - An incorrect Url is opened.");  
		   }  
		
		System.out.println("Page source " + pageSource);
		System.out.println("Page source length " + l);
		driver.quit();
	}

}
