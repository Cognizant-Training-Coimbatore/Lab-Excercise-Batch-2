import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase2 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");//which browser to use
		WebDriver driver = new ChromeDriver();//webdriver obj
		driver.get("https://jpetstore.cfapps.io/");//to launch the wegpage
		
		WebElement login = driver.findElement(By.linkText("Enter the Store"));//to find the element
		login.click();
		
		WebElement fish = driver.findElement((By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img")));
		fish.click();
		Thread.sleep(2000);
		WebElement f1 = driver.findElement(By.linkText("FI-SW-01"));
		f1.click();
		 
		Thread.sleep(2000);
		WebElement cart = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
		cart.click();
		Thread.sleep(2000);
		WebElement quantity;
		quantity = driver.findElement(By.id("lines0.quantity"));
		quantity.clear();
	    quantity.sendKeys("10");
	    Thread.sleep(5000);
	    driver.close();
	}

}
