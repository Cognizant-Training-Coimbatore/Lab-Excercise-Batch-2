package java_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm1_capture_title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("file:///D:/new.html");
System.out.println(driver.getTitle());
	driver.quit();
	}
}

	