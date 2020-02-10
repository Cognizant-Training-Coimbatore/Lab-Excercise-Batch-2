import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q4_day2 
{
	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		System.out.println(driver.getTitle());
		Select product= new Select(driver.findElement(By.name("category_id")));
		product.selectByVisibleText("Databases");
		driver.findElement(By.name("DoSearch")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Web Database Development")).click();
		String s=driver.findElement(By.name("quantity")).getAttribute("value");
		Thread.sleep(1000);
		System.out.println("Default value"+s);
		driver.findElement(By.name("Insert1")).click();
		Boolean a= driver.findElement(By.name("Delete1_1")).isSelected();
		Thread.sleep(1000);
		System.out.println("is delete selected"+a);
		driver.quit();
	}
	
}
