import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm2_link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\app.html");
		WebElement link1= driver.findElement(By.linkText("Google"));
		link1.click();
		System.out.println("Page title: "+driver.getTitle());
		driver.quit();
	}

}
