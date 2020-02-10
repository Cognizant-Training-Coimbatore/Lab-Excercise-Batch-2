import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class day2_program2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\amrutha\\java\\seleniumfile\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://examples.codecharge.com/Store/Default.php ");
	    System.out.println(driver.getTitle());
	    Select list=new Select(driver.findElement(By.name("category_id")));
	    list.selectByVisibleText("Databases");
	    Thread.sleep(2000);
	    driver.findElement(By.name("DoSearch")).click();
	    Thread.sleep(2000);
	    driver.quit();
	}

}
