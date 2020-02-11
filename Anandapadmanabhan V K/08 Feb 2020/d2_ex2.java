package basic_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class d2_ex2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\java\\Selenium Examples\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Online Bookstore";
		if (actualTitle.equals(expectedTitle))
		{
			System.out.println("Title is True");
		}
		else
		{
			System.out.println("Title is False");
		}
		WebElement link1 = driver.findElement(By.linkText("Databases"));
		link1.click();
		WebElement link2 = driver.findElement(By.name("DoSearch"));
		link2.click();
		driver.quit();
		

	}

}
