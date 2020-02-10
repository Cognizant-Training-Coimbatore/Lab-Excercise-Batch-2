package basiccommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Testcase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\javaprg\\seleniumexamples\\chromedriver.exe");
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		//Open the url "https://wwww.selenium.dev/"
		driver.get("https://www.selenium.dev/");
		System.out.println("Page Title:" +driver.getTitle());
		System.out.println("Page title length:+" +driver.getTitle().length());
		//Wait 5 seconds
		Thread.sleep(5000);
		//Close the Browser
		driver.quit();

	}

}
