import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pgmex04 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		System.out.println(driver.getTitle());
		Select comb= new Select(driver.findElement(By.name("category_id")));
		comb.selectByVisibleText("Databases");
		driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/form/table[2]/tbody/tr[3]/td/input")).click();
		driver.findElement(By.linkText("Web Database Development")).click();
		String num= driver.findElement(By.name("quantity")).getAttribute("value");
		System.out.println("String : "+num);
		driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/form/p[2]/input[1]")).click();
		List<WebElement> chk = driver.findElements(By.name("Delete1_1"));
		if(chk.get(0).isSelected())
		{
			System.out.println("Check box selected");
		}
		else
		{
			System.out.println("Not selected");
		}
		Thread.sleep(4000);
		driver.quit();
	}

}
