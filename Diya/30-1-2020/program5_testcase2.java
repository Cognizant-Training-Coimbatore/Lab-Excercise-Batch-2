import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program5_testcase2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://jpetstore.cfapps.io");
		WebElement enter=driver.findElement(By.linkText("Enter the Store"));
		enter.click();
		String s=driver.getTitle();
		System.out.println(s);
		WebElement fishlink=driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]"));
		fishlink.click();
		Thread.sleep(2000);
		WebElement fish;
		fish=driver.findElement(By.linkText("FI-SW-01"));
		fish.click();
		Thread.sleep(2000);
		
		WebElement cart=driver.findElement(By.linkText("Add to Cart"));
		cart.click();
		Thread.sleep(2000);

		WebElement quantity=driver.findElement(By.id("lines0.quantity"));
		quantity.sendKeys("0");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
