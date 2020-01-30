import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm_testcase_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jpetstore.cfapps.io/");
		WebElement enterthestore=driver.findElement(By.linkText("Enter the Store"));
		enterthestore.click();
		String s=driver.getTitle();
		System.out.println(s);
		WebElement fish=driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img"));
		fish.click();
		Thread.sleep(2000);
		WebElement Product_ID;
		 Product_ID=driver.findElement(By.linkText("FI-SW-01"));
		 Product_ID.click();
		 WebElement select;
		 select=driver.findElement(By.linkText("EST-1"));
		 select.click();
		 Thread.sleep(2000);
		WebElement Add=driver.findElement(By.linkText("Add to Cart"));
		Add.click();
		Thread.sleep(2000);
		WebElement quantity;
		quantity=driver.findElement(By.id("lines0.quantity"));
		driver.findElement(By.id("lines0.quantity")).clear();
		quantity.sendKeys("10");
		
		
		Thread.sleep(5000);
		driver.quit();
	}

}
