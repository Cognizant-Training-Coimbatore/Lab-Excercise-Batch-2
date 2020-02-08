package java_demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm5_radio_button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("file:///D:/new.html");
		List<WebElement> radio1= driver.findElements(By.name("gender"));
		System.out.println(radio1.get(0).isSelected());
		System.out.println(radio1.get(1).isSelected());
		Thread.sleep(2000);
		radio1.get(0).click();
		Thread.sleep(5000);
		System.out.println(radio1.get(0).isSelected());
		
		
		driver.quit();
	}

}
