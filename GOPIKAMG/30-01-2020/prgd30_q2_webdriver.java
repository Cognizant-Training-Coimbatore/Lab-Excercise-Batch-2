import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prgd30_q2_webdriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("http://jpetstore.cfapps.io/");
		  WebElement login=driver.findElement(By.linkText("Enter the Store"));
		  login.click();
		  String s =driver.getTitle();
		  System.out.println(s);
		  WebElement login1=driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img"));
		  login1.click();
		  Thread.sleep(2000);
		 // WebElement login2=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
				//  login2.click();
		  WebElement login3=driver.findElement(By.linkText("FI-SW-01"));
		  login3.click();
		  Thread.sleep(2000);
		  WebElement login2=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
		  login2.click();
		  Thread.sleep(2000);
		  WebElement Quantity;
		  Quantity=driver.findElement(By.id("lines0.quantity"));
		  driver.findElement(By.id("lines0.quantity")).clear();
		  Quantity.sendKeys("10");
		  Thread.sleep(2000);
		  driver.quit();
	}

}
