import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class que2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jpetstore.cfapps.io/");
		WebElement login=driver.findElement(By.linkText("Enter the Store"));
		login.click();
		Thread.sleep(3000);
		driver.get("https://jpetstore.cfapps.io/catalog/categories/FISH");
		Thread.sleep(3000);
		driver.get("https://jpetstore.cfapps.io/catalog/categories/FI-SW-01");
		Thread.sleep(2000);
		driver.get("https://jpetstore.cfapps.io/cart?add&itemId=EST-1");
		Thread.sleep(1000);
		WebElement quantity;
		quantity=driver.findElement(By.id("lines0.quantity"));
		quantity.sendKeys("0");
		Thread.sleep(5000);
		driver.quit();// TODO Auto-generated method stub

	}

}
