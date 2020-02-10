package basic_commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_tclass {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\java programs\\selenium_example\\chromedriver.exe");
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		//Open the url "https://www.selenium.dev/"
		driver.get("http://selenium.dev/");
	    //Wait 5 seconds
		Thread.sleep(5000);
		//close the browser
		 String s=driver.getTitle();
		 System.out.println("Title: "+s);
		 System.out.println("length: "+s.length());
		driver.quit();

	}

}
