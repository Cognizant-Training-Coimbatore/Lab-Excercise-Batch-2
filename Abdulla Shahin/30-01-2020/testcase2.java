import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jpetstore.cfapps.io/");
		WebElement login = driver.findElement(By.linkText("Enter the Store"));
		login.click();
		String s = driver.getTitle();
		System.out.println(s);
		WebElement login1 = driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img"));
		login1.click();
		WebElement login3 = driver.findElement(By.linkText("FI-SW-01"));
		login3.click();
		Thread.sleep(2000);
		WebElement login4 = driver.findElement(By.linkText("EST-1"));
		login4.click();
		Thread.sleep(2000);																
		WebElement login5 = driver.findElement(By.linkText("Add to Cart"));
		login5.click();
		Thread.sleep(2000);
		WebElement qty = driver.findElement(By.id("lines0.quantity"));
		driver.findElement(By.id("lines0.quantity")).clear();
		qty.sendKeys("10");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
