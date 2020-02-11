import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import multiScreenShot.MultiScreenShot;

public class multiscreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		MultiScreenShot screen=new MultiScreenShot("D:\\Java Programs\\Demo2\\Screenshot\\","multiscreenshot");
		System.setProperty("webdriver.chrome.driver", "D:\\Java Programs\\Demo2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		screen.multiScreenShot(driver);
		screen.elementScreenShot(driver,driver.findElement(By.xpath("//*[@id=\"body\"]/center")));
		
	}

}
