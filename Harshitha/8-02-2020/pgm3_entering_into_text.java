import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm3_entering_into_text {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\app.html");
		driver.findElement(By.id("text")).sendKeys("Anju");;
		Thread.sleep(2000);
		String s=driver.findElement(By.id("text")).getAttribute("value");
		System.out.println(s.length());
		driver.quit();
	}

}
