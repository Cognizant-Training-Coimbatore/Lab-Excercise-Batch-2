package feb11;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import multiScreenShot.MultiScreenShot;

public class Multoscreen_shot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		MultiScreenShot screen=new MultiScreenShot("E:\\selenium\\","Multoscreen_shot");
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		screen.multiScreenShot(driver);
		screen.elementScreenShot(driver, driver.findElement(By.xpath("//*[@id=\"hplogo\"]")));
		driver.quit();
	}

}
