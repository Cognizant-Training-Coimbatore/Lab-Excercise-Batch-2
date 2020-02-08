package java_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm3_enter_into_textbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("file:///D:/new.html");
		driver.findElement(By.id("txt1")).sendKeys("unni");
		Thread.sleep(2000);
		driver.quit();
	}

}
