package webDriverDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://gmail.com");
	       String s="https://gmail.com";
	       String y=driver.getTitle();
	       String x=driver.getCurrentUrl();
	       System.out.println("Title of web is : " +y);
	       System.out.println("Current url : "+s);
	       System.out.println("length : " +s.length());
	       System.out.println("actual url: "+x);
	       System.out.println(" length : " +x.length());
	       
	       if(s==x) {
	    	   System.out.println("Current url and actual url are same");
	       }
	       else {
	    	   System.out.println("Current url and actual url are not same");
	       }
	       String sr=driver.getPageSource();
	       System.out.println(sr);
	       int z=sr.length();
	       System.out.println("Page source :" +z);
	       
	       Thread.sleep(500);
	       driver.quit();

	}

}
