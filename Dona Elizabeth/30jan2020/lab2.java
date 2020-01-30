import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jpetstore.cfapps.io");
		WebElement login=driver.findElement(By.linkText("Enter the Store"));
		login.click();
		String s=driver.getTitle();
		System.out.println(s);
		WebElement fish;
	    fish=driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]"));
	    fish.click();
	    WebElement fish1;
	    fish1=driver.findElement(By.linkText("FI-SW-01"));
	    fish1.click();
	    Thread.sleep(3000);
	    
	    WebElement fish2;
	    fish2=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
	    fish2.click();
	   
		Thread.sleep(3000);
		WebElement qua;
		qua=driver.findElement(By.id("lines0.quantity"));
		qua.sendKeys("10");
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
