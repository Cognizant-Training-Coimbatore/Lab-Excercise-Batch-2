import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class lab_exc_4 {

	public static void main(String[] args) throws InterruptedException
	{
		System.getProperty("webdriver.chrome.driver", "\"C:\\\\Users\\\\Admin\\\\Desktop\\\\java_programs\\\\selenium examples\\\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		System.out.println("the page title is : "+driver.getTitle());
		Select sel=new Select(driver.findElement(By.name("category_id")));
		sel.selectByVisibleText("Databases");
		driver.findElement(By.name("DoSearch")).click();
		WebElement link=driver.findElement(By.linkText("Web Database Development"));
		link.click();
		WebElement val=driver.findElement(By.name("quantity"));
		String l=val.getAttribute("value");
		System.out.println("value in the field is "+l);
		WebElement link2=driver.findElement(By.name("Insert1"));
		link2.click();
		WebElement check1=driver.findElement(By.name("Delete1_1"));
		if(check1.isSelected()==true)
		{
			System.out.println("selected");
		}
		else
		{
			System.out.println("not selected");
		}
		Thread.sleep(2500);
		driver.quit();
		
	}

}
