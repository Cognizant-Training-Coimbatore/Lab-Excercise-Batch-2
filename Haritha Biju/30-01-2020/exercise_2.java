package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Test case 2
Open the browser
Open the URL https://jpetstore.cfapps.io/
Click on the link "Enter the store"
Store the title in a variable and print in console
Click on the Fish link
Click on the fish with the id FI-SW-01
Click on Add to cart
Enter the quantity as "10"
Close the b
Close the browser
*/
public class exercise_2
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jpetstore.cfapps.io/");
		WebElement store=driver.findElement(By.linkText("Enter the Store"));
		store.click(); 			
		String s= driver.getTitle(); // to store title to a string
		System.out.println(s);
		WebElement fish =driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]"));
		fish.click();
		Thread.sleep(1000);
		WebElement type =driver.findElement(By.linkText("FI-SW-01"));
		type.click();
		Thread.sleep(1000);
		WebElement add=driver.findElement(By.linkText("Add to Cart"));
		add.click(); 
		Thread.sleep(1000);
		WebElement qnt;
		qnt=driver.findElement(By.id("lines0 .quantity"));
		Thread.sleep(1000);
		qnt.sendKeys("0"); 
		Thread.sleep(5000);
		driver.quit(); // to close the browser
	}

}
