package basic_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\JAVA PROGRAMS\\Selenium_examples\\chromedriver.exe");
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Nature Images");
		driver.findElement(By.name("q")).submit();
		// TODO Auto-generated method stub

	}

}
