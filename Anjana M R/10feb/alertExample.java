import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/Anjana/feb10a.html");
		driver.findElement(By.id("button1")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(5000);
		driver.quit();
		
		

	}

}
