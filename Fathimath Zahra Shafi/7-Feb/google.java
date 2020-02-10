package basic_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\java_programs\\selenium_examples\\chromedriver.exe");
		
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://www.google.com/");
				driver.findElement(By.name("q")).sendKeys("nature images");
				driver.findElement(By.name("q")).submit();
				

	}

}