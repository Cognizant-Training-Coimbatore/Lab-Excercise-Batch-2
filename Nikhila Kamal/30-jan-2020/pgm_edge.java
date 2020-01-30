import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm_edge {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		String s=driver.getTitle();
		System.out.println(s);
		int TitleLength= s.length();
		System.out.println("title length: " + TitleLength);
		
		String currenturl = driver.getCurrentUrl();
		System.out.println("current url: " + currenturl);
		int urllen = currenturl.length();
		System.out.println("url length :" + urllen);
		String actualUrl = driver.getCurrentUrl();  
		if (actualUrl.equals("https://paytm.com/")){  
			System.out.println("Verification Successful - The correct Url is opened.");  
			}  
			else{  
			  
			System.out.println("Verification Failed - An incorrect Url is opened.");  
			         }  
		String pageSource = driver.getPageSource();  
		System.out.println(pageSource);
      
		int pageSourceLength = pageSource.length();  
		           
		
		System.out.println("Total length of the Page Source : " + pageSourceLength);  
		
			       
		
		Thread.sleep(5000);
		driver.quit();
	}

}



	
