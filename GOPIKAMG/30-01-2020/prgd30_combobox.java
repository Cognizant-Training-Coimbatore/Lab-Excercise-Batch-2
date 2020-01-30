
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class prgd30_combobox {

	public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("http://examples.codecharge.com/Store/Default.php");
		 Select product=new Select((WebElement) driver.findElements(By.name("category_id")));
		 int total=product.getOptions().size();
		 System.out.println(total);
		  driver.quit();
		  
	}

}