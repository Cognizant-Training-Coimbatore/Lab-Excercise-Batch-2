package labexecise1222020;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/testcase5.html.htm");
		WebElement ab=driver.findElement(By.xpath("/html/body/table/tbody"));
		List<WebElement> zz=ab.findElements(By.tagName("tr"));
		System.out.println(zz.size());
		WebElement ac=driver.findElement(By.xpath("/html/body/table/tbody/tr[1]"));
		List<WebElement> vv=ac.findElements(By.tagName("td"));
		System.out.println(vv.size());
		driver.findElement(By.name("r2")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
