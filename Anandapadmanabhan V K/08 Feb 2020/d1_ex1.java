package basic_commands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class d1_ex1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\java\\Selenium Examples\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		WebElement link1 = driver.findElement(By.linkText("Register"));
		link1.click();
		String actualTitle = driver.getTitle();
		String expectedTitle = "Demo Web Shop. Register";
		if (actualTitle.equals(expectedTitle))
		{
			System.out.println("Title is True");
		}
		else
		{
			System.out.println("Title is False");
		}
		List<WebElement> gender = driver.findElements(By.name("Gender"));
		gender.get(0).click();
		driver.findElement(By.id("Email")).sendKeys("abdullashaheen007@gmail.com");
		driver.findElement(By.id("FirstName")).sendKeys("Will");
		driver.findElement(By.id("LastName")).sendKeys("Smith");
		driver.findElement(By.id("Password")).sendKeys("pass123$");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("pass123$");
		WebElement link2 = driver.findElement(By.id("register-button"));
		link2.click();
		WebElement link3 = driver.findElement(By.linkText("Log out"));
		link3.click();
		driver.quit();

	}

}