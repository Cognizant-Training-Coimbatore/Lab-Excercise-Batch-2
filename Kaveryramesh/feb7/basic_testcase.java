package selenium_examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic_testcase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\javaprograms\\selenium_examples\\chromedriver.exe");
		
//		Launch the chrome browser 
		WebDriver driver=new ChromeDriver();
//		open the url "https://www.selenium.dev/"
		driver.get("https://selenium.dev/");
		System.out.println("page Title"+driver.getTitle());
		System.out.println("page title length "+driver.getTitle().length());
//		wait 5 seconds 
		Thread.sleep(5000);
//		close the Browser 
        driver.quit();

	}

}
