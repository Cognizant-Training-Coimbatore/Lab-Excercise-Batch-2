import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pgmex02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		System.out.println(driver.getTitle());
		Select comb= new Select(driver.findElement(By.name("category_id")));
		comb.selectByVisibleText("Databases");
		driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/form/table[2]/tbody/tr[3]/td/input")).click();
		Thread.sleep(4000);
		driver.quit();
	}

}
