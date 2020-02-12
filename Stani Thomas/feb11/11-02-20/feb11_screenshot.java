package selenium_examples;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import multiScreenShot.MultiScreenShot;

public class feb11_screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	MultiScreenShot screen =new MultiScreenShot("D:\\stani\\","feb11_screenshot");
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		screen.multiScreenShot(driver);
		screen.elementScreenShot(driver,driver.findElement(By.xpath("//*[@id=\"body\"]/center")));
		driver.quit();
	}

}
