import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class capture_property {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/html/selemium1.html");
		driver.findElement(By.id("text1")).sendKeys("Jishnu");
		String s=driver.findElement(By.id("text1")).getAttribute("value");
		System.out.println(s.length());
		Thread.sleep(5000);
		driver.quit();
	}

}
