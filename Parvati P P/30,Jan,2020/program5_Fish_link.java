import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program5_Fish_link {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("wedriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://jpetstore.cfapps.io/");
		WebElement login=driver.findElement(By.linkText("Enter the Store")); 
		login.click();
		/*driver.findElement(By.id("Enter the store")).click();  */
		 String s = driver.getTitle();
	     System.out.println(s);  
	     WebElement fish=driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img")); 
			fish.click();
			Thread.sleep(2000);
			WebElement type=driver.findElement(By.linkText("FI-SW-01")); 
			type.click();
			Thread.sleep(2000);
			WebElement cart=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
			cart.click();
			Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"lines0.quantity\"]")).sendKeys("0");
			 Thread.sleep(2000);
			driver.quit();
	}
	}
