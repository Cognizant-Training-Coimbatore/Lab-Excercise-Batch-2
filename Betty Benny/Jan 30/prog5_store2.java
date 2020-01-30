import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prog5_store2 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jpetstore.cfapps.io/");
		WebElement login=driver.findElement(By.linkText("Enter the Store"));
		login.click();
		String s=driver.getTitle();
		System.out.println(s);
		Thread.sleep(5000);
		WebElement fish=driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img"));
		fish.click();
		Thread.sleep(5000);
		WebElement fish1=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
		fish1.click();
		Thread.sleep(5000);
		WebElement cart=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
		cart.click();
		Thread.sleep(5000);
		WebElement cart1=driver.findElement(By.xpath("//*[@id=\"lines0.quantity\"]"));
		cart1.sendKeys("0");
		Thread.sleep(5000);
		
		
		driver.quit();
		
	}

}
