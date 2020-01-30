import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class question2testcase2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chroome.driver", "chromedriver.exe");//specify which browser should be used.
		WebDriver driver = new ChromeDriver();
		driver.get("http://jpetstore.cfapps.io/");
		WebElement login = driver.findElement(By.linkText("Enter the Store"));
		login.click();
		String s = driver.getTitle();
		System.out.println(s);
		WebElement fish = driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img"));
		fish.click();
		WebElement fishid = driver.findElement(By.linkText("FI-SW-01"));
		fishid.click();
		WebElement addto = driver.findElement(By.linkText("Add to Cart"));
		addto.click();
		WebElement quantity=driver.findElement(By.id("lines0.quantity"));
		quantity.sendKeys("10");
		Thread.sleep(5000);
		//driver.quit();		
	}

}
