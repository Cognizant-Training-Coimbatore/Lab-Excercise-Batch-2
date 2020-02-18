package screenshot;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import multiScreenShot.MultiScreenShot;

public class multiscreenshot {

	public static void main(String[] args) throws IOException
	{
		MultiScreenShot screen = new MultiScreenShot("C:\\Users\\admin\\Desktop\\","Multiscreenshot_File");
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		screen.multiScreenShot(driver);
		screen.elementScreenShot(driver, driver.findElement(By.xpath("//*[@id=\"body\"]/center")));
	}

}
