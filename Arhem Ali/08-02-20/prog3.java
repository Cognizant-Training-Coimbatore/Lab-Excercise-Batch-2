package basic_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prog3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/app.html");
		driver.findElement(By.id("t1")).sendKeys("gshs");
		Thread.sleep(5000);
		String s=driver.findElement(By.id("t1")).getAttribute("value");
		System.out.println(s);
		

	}

}
