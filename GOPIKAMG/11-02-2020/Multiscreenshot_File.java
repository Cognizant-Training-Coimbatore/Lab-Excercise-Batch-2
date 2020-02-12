package basiccommands;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import multiScreenShot.MultiScreenShot;

public class Multiscreenshot_File {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 MultiScreenShot screen=new MultiScreenShot("C:\\Users\\admin\\Desktop\\javaprg\\seleniumexamples\\Screenshot\\","Multiscreenshot_File");
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\javaprg\\seleniumexamples\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://google.com/");
	screen.multiScreenShot(driver);
	screen.elementScreenShot(driver,driver.findElement(By.xpath(" //*[@id=\"main\"]")));
	}

}
