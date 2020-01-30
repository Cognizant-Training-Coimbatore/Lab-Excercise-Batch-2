package webdriverdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class date30_launch_browser {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://facebook.com");
String s=driver.getTitle();
System.out.println(s);
driver.quit();
	}

}
