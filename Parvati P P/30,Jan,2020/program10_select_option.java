import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program10_select_option {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("wedriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		Select product=new Select(driver.findElement(By.className("category_id")));
		int size=product.getOptions().size();
		int i;
	for(i=0;i<size;i++)
	{
		product.deselectByIndex(i);
		Thread.sleep(2000);
		String s=product.getFirstSelectedOption().getText();
		System.out.println(s);
	}
	driver.quit();
	}

}
