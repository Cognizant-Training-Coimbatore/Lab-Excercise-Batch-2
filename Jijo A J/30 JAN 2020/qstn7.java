import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class qstn7 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://jpetstore.cfapps.io/");
		WebElement enter=driver.findElement(By.linkText("Enter the Store"));
		enter.click();
		String s=driver.getTitle();
		System.out.println(s);
		WebElement fish=driver.findElement(By.xpath("/html/body/div[2]/section/div[2]/div[1]/div/a[1]"));
		fish.click();
		Thread.sleep(2000);
		WebElement fish1=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
		fish1.click();
		Thread.sleep(2000);
		WebElement fish11=driver.findElement(By.linkText("Add to Cart"));
		fish11.click();
		Thread.sleep(2000);
		WebElement q;
		q=driver.findElement(By.id("lines0.quantity"));
		q.sendKeys("0");
		
		Thread.sleep(5000);
		
		

		driver.quit();
	
	}

}
