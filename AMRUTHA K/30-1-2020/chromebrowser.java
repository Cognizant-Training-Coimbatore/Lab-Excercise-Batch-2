package webdriverdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");//which browser using//chrome//explorer
		WebDriver driver =new ChromeDriver();
		driver.get("http://google.com");//to open the web page
		
		String s=driver.getTitle();
	    System.out.println(s);
	    System.out.println("title length:"+s.length());
	    String d=driver.getCurrentUrl();
	    System.out.println("current url"+d);
	    if(s==d) {
	    	System.out.println("both are same");
	    }
	    else 
	    	{System.out.println("not same");}
	    
	    System.out.println(driver.getPageSource());
	    String h=driver.getPageSource();
	    
	    System.out.println("page source length="+h.length());
	    System.out.println(driver.getClass());
	    
	    
	    
		driver.quit();
		

	}

}
