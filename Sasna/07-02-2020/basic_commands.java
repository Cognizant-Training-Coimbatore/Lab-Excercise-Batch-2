package basic_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic_commands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\java programs GBE\\selenium\\chromedriver.exe");
		//Launch the Chrome browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://wwww.google.com/");
		
		//Open the url "https://www.selenium.dev/"
		driver.get("https://selenium.dev/");
		System.out.println("Page Title:"+driver.getTitle());
		System.out.println("Page Title:"+driver.getTitle().length());
		//Wait 5 Seconds 
		Thread.sleep(5000);
		//Close the Browser
		driver.quit();

	}

}
