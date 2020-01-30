import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class question2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jpetstore.cfapps.io/");
		WebElement enterthestore = driver.findElement(By.linkText("Enter the Store"));
		enterthestore.click();
		String s = driver.getTitle();
		System.out.println(s);
		WebElement fish = driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img"));
		fish.click();
		Thread.sleep(2000);
		WebElement fishid = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
		fishid.click();
		Thread.sleep(2000);
		WebElement addtocart = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
		addtocart.click();
		Thread.sleep(2000);
		WebElement quantity;
		quantity = driver.findElement(By.id("lines0.quantity"));
		quantity.clear();
		quantity.sendKeys("10");
		Thread.sleep(5000);
		driver.quit();

	}

}
