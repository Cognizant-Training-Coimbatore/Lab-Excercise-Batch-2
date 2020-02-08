package seleniumeg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prgm1_capture_title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\selenium_example\\chromedriver.exe");
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		
		//open the url "https://www.selenium.dev/"
		driver.get("file:///D:/test/exp.html");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
