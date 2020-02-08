import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm3_enteringvalue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\app.html");
		driver.findElement(By.id("txt1")).sendKeys("Abhijith");
		Thread.sleep(4000);
		String s = driver.findElement(By.id("txt1")).getAttribute("value");
		System.out.println("Length: "+s.length());
		driver.quit();
	}

}
