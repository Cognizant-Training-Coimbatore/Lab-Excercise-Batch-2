import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://jpetstore.cfapps.io/");
		WebElement login=driver.findElement(By.linkText("Enter the Store"));
		login.click();
		String s=driver.getTitle();
		System.out.println(s);
		Thread.sleep(1000);
		WebElement fish=driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img"));
		fish.click();
		Thread.sleep(1000);
		WebElement FISW=driver.findElement(By.linkText("FI-SW-01"));
		FISW.click();
		Thread.sleep(1000);
		WebElement FISW1=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
		FISW1.click();
		Thread.sleep(1000);
		WebElement FISW2=driver.findElement(By.xpath("//*[@id=\"lines0.quantity\"]"));
		Thread.sleep(1000);
		FISW2.sendKeys("0");
		Thread.sleep(5000);
		driver.quit();

	}

}
