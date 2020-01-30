import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_testcase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jpetstore.cfapps.io/");
		WebElement store=driver.findElement(By.linkText("Enter the Store"));
		store.click();
		
		WebElement fish=driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]"));
		Thread.sleep(1000);
		fish.click();
		WebElement fishid = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
		Thread.sleep(1000);
		fishid.click();
		
		WebElement cart=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
		Thread.sleep(1000);
		cart.click();
		WebElement quantity;
		quantity=driver.findElement(By.id("lines0.quantity"));
		Thread.sleep(1000);
		quantity.sendKeys("0");
		
		Thread.sleep(5000);

		String s=driver.getTitle();
		System.out.println(s);
		
		driver.quit();
		

	}

}
