import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day3_ex4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("1234");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
