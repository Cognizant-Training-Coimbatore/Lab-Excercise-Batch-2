import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pgm6_select_value_from_combobox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.com.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		Select product=new Select(driver.findElement(By.name("category_id")));
		product.selectByVisibleText("Databases");
		//int total=product.getOptions().size();
		//System.out.println(total);
		Thread.sleep(3000);
		driver.quit();
	}

}
