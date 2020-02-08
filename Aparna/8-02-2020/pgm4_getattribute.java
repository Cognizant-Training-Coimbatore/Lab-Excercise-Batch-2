package java_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm4_getattribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("file:///D:/new.html");
		driver.findElement(By.id("txt1")).sendKeys("unni");
		Thread.sleep(2000);
		String s= driver.findElement(By.id("txt1")).getAttribute("value");
		System.out.println(s.length());
		driver.quit();
	}
	}


