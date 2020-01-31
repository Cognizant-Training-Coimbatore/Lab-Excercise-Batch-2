import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BROWSER_5_PROGRAM_GIVEN {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jpetstore.cfapps.io/");
		String s=driver.getTitle();
		System.out.println(s);
		WebElement enter=driver.findElement(By.linkText("Enter the Store"));
		enter.click();
		Thread.sleep(3000);
		
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]"));
		ele.click();
		Thread.sleep(3000);
		
		WebElement el=driver.findElement(By.linkText("FI-SW-01"));
		el.click();
		Thread.sleep(3000);
		
		
		WebElement elem=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
		
		elem.click();
		Thread.sleep(3000);
WebElement elem1=driver.findElement(By.linkText("Add to Cart"));
		
		elem1.click();
		

		WebElement Quantity=driver.findElement(By.id("lines0.quantity"));
		Quantity.sendKeys("10");
		driver.findElement(By.id("lines0.quantity")).clear();
		
		
		
		
				
		
		Thread.sleep(2000);
		
		
		
		
		driver.quit();
		

	}

}
