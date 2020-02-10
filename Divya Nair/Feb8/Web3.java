import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Web3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		System.out.println(driver.getTitle());
		Select database=new Select(driver.findElement(By.name("category_id")));
		database.selectByVisibleText("Databases");
		System.out.println(database.getOptions().size());
		int size=database.getOptions().size();
		int i;
		for(i=0;i<size;i++)
		{
			database.selectByIndex(i);
			Thread.sleep(5000);
			String s=database.getFirstSelectedOption().getText();
			System.out.println(s);
			
		}


	}

}
