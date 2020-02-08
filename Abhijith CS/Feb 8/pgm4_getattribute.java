import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm4_getattribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\app.html");
		driver.findElement(By.id("txt1")).sendKeys("Abhijith");
		Thread.sleep(4000);
		driver.quit();
	}

}
