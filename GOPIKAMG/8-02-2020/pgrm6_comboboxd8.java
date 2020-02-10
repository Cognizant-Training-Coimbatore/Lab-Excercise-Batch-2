import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pgrm6_comboboxd8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("file:///E:/app.html ");
		   Select combo1=new Select(driver.findElement(By.id("combo1")));
		   combo1.selectByVisibleText("OptionE");
		   Thread.sleep(5000);
		   driver.quit();
		   
	}

}
