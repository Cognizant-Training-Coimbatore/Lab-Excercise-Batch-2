import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program5q2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jpetstore.cfapps.io/");
		WebElement enterthestore = driver.findElement(By.linkText("Enter the Store"));
		enterthestore.click();
		String s = driver.getTitle();
		System.out.println(s);
		WebElement fish = driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img"));
		fish.click();
		Thread.sleep(5000);
		WebElement fishid = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
		fishid.click();
		WebElement addcart= driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
		addcart.click();
		WebElement link5=driver.findElement(By.id("lines0.quantity"));
		link5.clear();
		link5.sendKeys("10");
		Thread.sleep(3000);
		driver.quit();

	}

}
