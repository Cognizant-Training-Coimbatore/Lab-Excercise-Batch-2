import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program7_print_items_from_dropdownlist {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		Select product=new Select(driver.findElement(By.name("category_id")));
		int size=product.getOptions().size();
		int i;
		for(i=0;i<size;i++)
		{
			product.selectByIndex(i);
			Thread.sleep(4000);
			String s=product.getFirstSelectedOption().getText();
			System.out.println(s);
		}
		driver.quit();
	}

}