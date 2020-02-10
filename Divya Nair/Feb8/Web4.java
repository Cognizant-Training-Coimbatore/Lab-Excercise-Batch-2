import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Web4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		System.out.println(driver.getTitle());
		Select database=new Select(driver.findElement(By.name("category_id")));
		database.selectByVisibleText("Databases");
		Thread.sleep(1000);
		WebElement search=driver.findElement(By.name("DoSearch"));
		search.click();
		WebElement link=driver.findElement(By.linkText("Web Database Development"));
		link.click();
		String s=driver.findElement(By.name("quantity")).getAttribute("value");
		System.out.println(s);
		WebElement cart=driver.findElement(By.name("Insert1"));
		cart.click();
		WebElement delete=driver.findElement(By.name("Delete1_1"));
		boolean res=delete.isSelected();
		if(res==true)
		{
			System.out.println("Alraedy exist....");
			
		}
		else
		{
			System.out.println("Not Selected..selecting now....");
			delete.click();
			Thread.sleep(5000);
		}
		driver.quit();
		
		
		

	}

}
