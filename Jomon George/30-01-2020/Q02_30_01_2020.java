package Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q02_30_01_2020 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jpetstore.cfapps.io/");
		WebElement Storelink = driver.findElement(By.linkText("Enter the Store"));
		Storelink.click();
		
		String s = driver.getTitle();
		System.out.println(s);
		
		WebElement fishlink = driver.findElement(By.xpath("//*[@id='SidebarContent']/a[1]"));
		fishlink.click();
		
		Thread.sleep(2000);
		WebElement fishtype = driver.findElement(By.linkText("FI-SW-01"));
		fishtype.click();
		
		Thread.sleep(2000);
		WebElement cartAdd = driver.findElement(By.linkText("Add to Cart"));
		cartAdd.click();
		
		Thread.sleep(2000);
		WebElement quantity = driver.findElement(By.id("lines0.quantity"));
		quantity.clear();
		quantity.sendKeys("101");
		
		Thread.sleep(5000);
		driver.quit();
	}

}
