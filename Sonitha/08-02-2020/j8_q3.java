import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class j8_q3 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		
		String a = "Online Bookstore";
		String b = driver.getTitle();
		if(a.equalsIgnoreCase(b)) {
		System.out.println("Verified the title ");
		}
		
		Select values = new Select(driver.findElement(By.name("category_id")));
	       values.selectByVisibleText("Databases");
	       driver.findElement(By.name("DoSearch")).click();
	       driver.findElement(By.linkText("Web Database Development")).click();
	       WebElement val = driver.findElement(By.name("quantity"));
	       System.out.println(val.getAttribute("value"));
	       
	       driver.findElement(By.name("Insert1")).click();
	       System.out.println(driver.findElement(By.name("Delete1_1")).isSelected());
	       
       Thread.sleep(5000);
       
       driver.quit();
	}

}
