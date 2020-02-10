package basic_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class q3_8_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Selenium\\Selenium_examples\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/app.html");
		driver.findElement(By.id("txt1")).sendKeys("Sree");
		Thread.sleep(5000);
		String s=driver.findElement(By.id("txt1")).getAttribute("value");
		System.out.println(s.length());
		System.out.println(s);
		driver.quit();
	}

}
