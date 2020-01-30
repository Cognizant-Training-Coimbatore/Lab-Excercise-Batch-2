import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jpetstore.cfapps.io/");
		WebElement enter = driver.findElement(By.linkText("Enter the Store"));
		enter.click();
		String s = driver.getTitle();
		System.out.println(s);
		WebElement in = driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img"));
		in.click();
		WebElement a1 = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
		a1.click();
		WebElement a2 = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
		a2.click();
		WebElement quantity;
		quantity = driver.findElement(By.xpath("//*[@id=\"lines0.quantity\"]"));
		quantity.sendKeys("10");
		
		driver.quit();

	}

}
