import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class j8_q2_totalValuesInComboBox {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		
		String a = "Online Bookstore";
		String b = driver.getTitle();
		if(a.equalsIgnoreCase(b)) 
		{
		  System.out.println("Verified the title ");
		}
		
		Select values = new Select(driver.findElement(By.name("category_id")));
        System.out.println(values.getOptions().size());
       Thread.sleep(5000);
       driver.quit();
	}

}
