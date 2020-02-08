package selenium_examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class feb7_basic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\stani\\java\\selenium_examples\\chromedriver.exe");
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		//Open the url "https://www.selenium.dev/"
		driver.get("https://selenium.dev/");
		System.out.println("page title : "+driver.getTitle());
		System.out.println("page title length : "+driver.getTitle().length());
		//Wait 5 seconds
		Thread.sleep(5000);
		
		//Close the browser
		driver.quit();
	}

}
