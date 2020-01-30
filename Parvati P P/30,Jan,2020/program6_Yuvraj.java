import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program6_Yuvraj {

	public static void main(String[] args) throws MalformedURLException {
		System.setProperty("wedriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com"); //launch browser
		 String c = driver.getTitle();
	     System.out.println(c);  
	     System.out.println("Page length is: "+c.length());
	    String a= driver.getCurrentUrl();
	     if (a.equals("http://demowebshop.tricentis.com")) {
	            System.out.println("Bothe the URL's are same..");
	     }
	     else
	     {
	    	 System.out.println("Incorrect URL");
	     }
	     String PageSource = driver.getPageSource();  
	     System.out.println(PageSource);
	     System.out.println("the length of page source: "+PageSource.length());
	     
	     driver.quit();
	}

}
