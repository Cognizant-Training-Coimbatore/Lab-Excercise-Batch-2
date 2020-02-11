package basic_commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic_test_case {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Java\\Selenium\\chromedriver.exe");
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		//Open the url "http://selenium.dev/"
		driver.get("http://selenium.dev/");
		System.out.println("Page Title:"+driver.getTitle());
		System.out.println("Page Title Length:"+driver.getTitle().length());
		//Wait 5 seconds
		Thread.sleep(5000);
		//Close the Browser
		driver.quit();
	}

}
