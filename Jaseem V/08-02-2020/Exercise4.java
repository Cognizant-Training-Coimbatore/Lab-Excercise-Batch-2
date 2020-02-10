import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercise4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		System.out.println("Page title :"+driver.getTitle());
		Select combo1 = new Select(driver.findElement(By.name("category_id")));
		combo1.selectByVisibleText("Databases");
		WebElement search = driver.findElement(By.name("DoSearch"));
		search.click();
		WebElement link2 =driver.findElement(By.linkText("Web Database Development"));
		link2.click();
		String s= driver.findElement(By.name("quantity")).getAttribute("value");
		System.out.println(s);
		WebElement add =driver.findElement(By.name("Insert1"));
		add.click();
		WebElement delete = driver.findElement(By.name("Delete1_1"));
		delete.click();
		Thread.sleep(3000);
		WebElement delete1 = driver.findElement(By.name("Delete1_1"));
		delete1.click();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
