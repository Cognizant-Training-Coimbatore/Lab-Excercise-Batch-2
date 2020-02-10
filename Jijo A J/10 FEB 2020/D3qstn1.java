import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D3qstn1 {
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
	
	
	
	//WebElement table1= driver.findElement(By.xpath("/html/body/table/tbody/tr[1]"));
	//List<WebElement> columns=table1.findElements(By.tagName("td"));
	//System.out.println("Column Size\t:\t"+columns.size());
	//for(int i=0;i<columns.size();i++)		
	//	System.out.println(columns.get(i).getText());
	
	
	driver.findElement(By.name("user_login")).sendKeys("Admin");
	driver.findElement(By.name("user_login")).sendKeys(Keys.CONTROL,"a");
	Thread.sleep(4000);
	driver.findElement(By.name("user_login")).sendKeys(Keys.CONTROL,"c");
	Thread.sleep(4000);
	driver.findElement(By .name("user_password")).sendKeys(Keys.CONTROL,"v");
	
	Thread.sleep(4000);
	driver.quit();

	}
}
