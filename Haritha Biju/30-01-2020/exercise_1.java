package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* Testcase 1
Open the browser
Open the URL https://jpetstore.cfapps.io/
Click on the link "Enter the store"
Store the title in a variable and print in console
Close the browser
*/
public class exercise_1
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jpetstore.cfapps.io/");
		WebElement store=driver.findElement(By.linkText("Enter the Store"));
		store.click(); 			
		String s= driver.getTitle(); // to store title to a string
		System.out.println(s);
		driver.quit(); // to close the browser


	}

}
