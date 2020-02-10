package basic_commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic_testcase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\java_programs\\selenium_examples\\chromedriver.exe");
		
		
//		Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		
		
//		Open the url "https://www.selenium.dev/"
		
		driver.get("https://selenium.dev/");
		System.out.println("page title: " +driver.getTitle());
		System.out.println("page title: " +driver.getTitle().length());
		
//		Wait 5 seconds 
		Thread.sleep(5000);
//		Close the Browser
		
		driver.quit();
		
		


	}

}
