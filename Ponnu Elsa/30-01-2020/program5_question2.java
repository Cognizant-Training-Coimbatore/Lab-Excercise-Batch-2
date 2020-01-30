import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program5_question2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jpetstore.cfapps.io/");
		WebElement login = driver.findElement(By.linkText("Enter the Store"));
		login.click();
		String s = driver.getTitle();
		System.out.println(s);
		WebElement fishlink = driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]"));
		fishlink.click();
		String s1 = driver.getTitle();
		System.out.println(s1);
		Thread.sleep(3000);
		WebElement idlink = driver.findElement(By.linkText("FI-SW-01"));
		idlink.click();
		Thread.sleep(3000);
		WebElement log3 = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
		log3.click();
		Thread.sleep(5000);
		WebElement quantity;
		quantity = driver.findElement(By.id("lines0.quantity"));
		quantity.sendKeys("0");
		
		Thread.sleep(3000);
		driver.quit();
	}

}
