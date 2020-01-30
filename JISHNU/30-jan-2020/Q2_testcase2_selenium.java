import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2_testcase2_selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();// for using chrome
		driver.get("https://jpetstore.cfapps.io/");
		WebElement store=driver.findElement(By.linkText("Enter the Store"));
		store.click();
		String s= driver.getTitle();// to get title
		System.out.println(s);
		WebElement fish=driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img"));
		fish.click();
		Thread.sleep(5000);
		WebElement fishid=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
		fishid.click();
		Thread.sleep(1000);
		WebElement cart=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
		cart.click();
		Thread.sleep(5000);
		WebElement quantity=driver.findElement(By.xpath("//*[@id=\"lines0.quantity\"]"));
		Thread.sleep(1000);
		quantity.sendKeys("0");
		Thread.sleep(5000);
		driver.quit();
	}

}
