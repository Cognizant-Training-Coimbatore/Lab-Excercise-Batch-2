package java_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pgm6_select {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("file:///D:/new.html");
		Select combo=new Select(driver.findElement(By.id("combo1")));
		
		combo.selectByVisibleText("optionB");
		
		System.out.println(combo.getOptions().size());
		Thread.sleep(2000);
		driver.quit();
	}

}
