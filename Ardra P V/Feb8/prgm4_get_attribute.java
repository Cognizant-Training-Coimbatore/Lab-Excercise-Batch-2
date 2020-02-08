package seleniumeg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prgm4_get_attribute {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\selenium_example\\chromedriver.exe");
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		
		//open the url "https://www.selenium.dev/"
		driver.get("file:///D:/test/exp.html");
		driver.findElement(By.id("txt1")).sendKeys("Ardra");
		
		Thread.sleep(5000);
		String s=driver.findElement(By.id("txt1")).getAttribute("value");
		System.out.println(s.length());
		driver.quit();
		
	}

}
