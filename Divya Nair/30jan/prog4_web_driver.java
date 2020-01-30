import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prog4_web_driver {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://jpetstore.cfapps.io");
		WebElement enter_store=driver.findElement(By.linkText("Enter the Store"));
		enter_store.click();
		String s=driver.getTitle();
		System.out.println(s);
		WebElement fish=driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]"));
		fish.click();
		Thread.sleep(3000);
		WebElement fishid=driver.findElement(By.linkText("FI-SW-01"));
		fishid.click();
		Thread.sleep(3000);
		WebElement add=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
		add.click();
		Thread.sleep(3000);
		WebElement Quantity;
		Quantity=driver.findElement(By.id("lines0.quantity"));
		driver.findElement(By.id("lines0.quantity")).clear();
		Quantity.sendKeys("10");
		
		Thread.sleep(5000);
		driver.quit();
	


	}

}
