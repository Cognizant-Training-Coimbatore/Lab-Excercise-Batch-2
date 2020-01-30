import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase2 {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jpetstore.cfapps.io/");
		WebElement Enter=driver.findElement(By.linkText("Enter the Store"));
		Enter.click();
		String s=driver.getTitle();
		System.out.println(s);
		WebElement Fish=driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img"));
		Fish.click();
		Thread.sleep(1000);
		WebElement id=driver.findElement(By.linkText("FI-SW-01"));
		//WebElement id=driver.findElement(By.linkText("FI-SW-01"));
		id.click();
		Thread.sleep(1000);
		WebElement cart=driver.findElement(By.linkText("Add to Cart"));
		//WebElement cart=driver.findElement(By.linkText("Add to Cart"));
		cart.click();
		Thread.sleep(1000);
		WebElement quantity=driver.findElement(By.id("lines0.quantity"));
		//WebElement quantity=driver.findElement(By.id("lines0.quantity"));
		Thread.sleep(1000);
		quantity.sendKeys("0");
	
		Thread.sleep(5000);
		driver.quit();

	}

}
