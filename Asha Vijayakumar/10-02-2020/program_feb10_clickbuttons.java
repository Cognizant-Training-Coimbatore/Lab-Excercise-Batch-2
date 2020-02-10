import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_feb10_clickbuttons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/asha/webdrive.html");
		driver.findElement(By.id("button1")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(8000);
		driver.quit();
		

	}

}
