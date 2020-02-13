import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day3a3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver","Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Computers")).click();
		driver.findElement(By.linkText("Accessories")).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
