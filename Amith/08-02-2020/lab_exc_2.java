import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class lab_exc_2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.getProperty("webdriver.chrome.driver", "\"C:\\\\Users\\\\Admin\\\\Desktop\\\\java_programs\\\\selenium examples\\\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		System.out.println("the page title is : "+driver.getTitle());
		Select sel=new Select(driver.findElement(By.name("category_id")));
		sel.selectByVisibleText("Databases");
		driver.findElement(By.name("DoSearch")).click();
		Thread.sleep(4000);
		driver.quit();
		
		

	}

}
