import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program_day2_excersise4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Java Programing Class\\selenium_examples\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		System.out.println(driver.getTitle());
		Select combo=new Select(driver.findElement(By.name("category_id")));
		combo.selectByVisibleText("Databases");
		driver.findElement(By.name("DoSearch")).click();
		
		driver.findElement(By.linkText("Web Database Development")).click();
		
		String value=driver.findElement(By.name("quantity")).getAttribute("value");
		System.out.println(value);
		driver.findElement(By.name("Insert1")).click();
		WebElement del=driver.findElement(By.name("Delete1_1"));
		boolean res=del.isSelected();
		if(res==true)
		{
			System.out.println("delete checkbox is ON");
			
			
			
		}
		else
		{
			System.out.println("delete checkbox is OFF");
			
		}
		Thread.sleep(5000);
		driver.quit();
		
		
		
	}

	

}
