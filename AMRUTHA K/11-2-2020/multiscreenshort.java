package day3exercise;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import multiScreenShot.MultiScreenShot;

public class multiscreenshort {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		MultiScreenShot abc= new MultiScreenShot("D:\\amrutha\\screenshots\\","multiscreenshort" );
		
	
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe") ;     
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/imghp?hl=en&tab=ri&ogbl");
		abc.multiScreenShot(driver);
		Thread.sleep(2000);
		abc.elementScreenShot(driver, driver.findElement(By.xpath("//*[@id=\"hplogo\"]")));
		
	}

}
