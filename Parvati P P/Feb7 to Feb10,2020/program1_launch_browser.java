import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program1_launch_browser {

	public static void main(String[] args) {
		{
			System.setProperty("wedriver.chrome.driver", "chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("http://demowebshop.tricentis.com");
			String s=driver.getTitle();
			System.out.println(s);
			Select product=new Select(driver.findElement(By.xpath("/html/body/select")));
			product.selectByVisibleText("Databases");
			
			driver.quit();
			;
		}
	}

}
