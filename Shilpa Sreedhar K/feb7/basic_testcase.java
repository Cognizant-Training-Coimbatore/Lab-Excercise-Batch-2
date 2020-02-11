package seleniumeg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic_testcase {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\java pgmng\\SeleniumEx\\chromedriver.exe");
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		
		//Open the url "https://www.selenium.dev/"
		driver.get("http://selenium.dev/");
		System.out.println("page title" +driver.getTitle());
		System.out.println("page title length " +driver.getTitle().length());
		//Wait 5 Seconds
		Thread.sleep(5000);
		//Close the browser
		driver.quit();

	}

}
