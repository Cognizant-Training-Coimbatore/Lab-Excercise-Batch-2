package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exerxise_3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");			
		String s= driver.getTitle(); // to store title to a string
		System.out.println("Page Title: "+s);
		System.out.println("Length of the title is : "+s.length());
		String newurl=driver.getCurrentUrl();
		System.out.println("The new url : "+newurl);
		if(newurl.equals("https://www.flipkart.com/"))
			System.out.println("new and old url are same");
		else
			System.out.println("new and old url are different");
		Class<? extends WebDriver> pageclass = driver.getClass();
		System.out.println("Page Class :  " + pageclass);
		String pagesource = driver.getPageSource();
		System.out.println( "Page Source :   " +pagesource +"\n Page Source length :   " + pagesource.length());
		driver.quit();
	}

}
