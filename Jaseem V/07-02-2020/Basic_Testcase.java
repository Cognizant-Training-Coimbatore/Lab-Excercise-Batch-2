package basic_commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Testcase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Java Programs\\selenium examples\\chromedriver.exe");
		//Launch the chrome browser
		WebDriver driver = new ChromeDriver();
		//Open the url "http://www.selenium.dev/"
		driver.get("https://selenium.dev/");
		System.out.println("Page title : "+driver.getTitle());
		System.out.println("Page title : "+driver.getTitle().length());
		//Wait 5 seconds
		Thread.sleep(5000);
		//Close the browser
		driver.quit();
	}

}
