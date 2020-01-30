import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jpetstore.cfapps.io/");
		WebElement login=driver.findElement(By.linkText("Enter the Store"));
		login.click();
		String s=driver.getTitle();
		WebElement fish=driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img"));
		fish.click();
		Thread.sleep(2000);
		WebElement id=driver.findElement(By.linkText("FI-SW-01"));
		id.click();
		Thread.sleep(2000);
		WebElement id1=driver.findElement(By.linkText("EST-1"));
		id1.click();
		Thread.sleep(2000);
		WebElement id12=driver.findElement(By.linkText("Add to Cart"));
		id12.click();
		Thread.sleep(2000);
		WebElement id2=driver.findElement(By.linkText("Add to Cart"));
		id2.click();
		Thread.sleep(2000);
		WebElement quantity;
		quantity=driver.findElement(By.id("lines0.quantity"));
		driver.findElement(By.id("lines0.quantity")).clear();
		quantity.sendKeys("10");
		Thread.sleep(5000);
		driver.quit();
		
	}

}
