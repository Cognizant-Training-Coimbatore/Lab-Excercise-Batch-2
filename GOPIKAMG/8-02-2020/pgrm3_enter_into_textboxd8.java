import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgrm3_enter_into_textboxd8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("file:///E:/app.html ");
		   driver.findElement(By.id("txt1")).sendKeys("gopika");
		   Thread.sleep(5000);
		   driver.quit();
	}

}
