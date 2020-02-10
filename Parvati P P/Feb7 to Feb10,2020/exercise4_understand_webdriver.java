import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class exercise4_understand_webdriver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		System.out.println(driver.getTitle());
		Select combo1=new Select(driver.findElement(By.name("category_id")));
		combo1.selectByVisibleText("Databases");
		Thread.sleep(2000);
		driver.findElement(By.name("DoSearch")).click();
		Thread.sleep(2000);
		WebElement link1=driver.findElement(By.linkText("Web Database Development"));
		link1.click();
		Thread.sleep(2000);
		String typedText = driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/form/p[1]/input")).getAttribute("value");
		System.out.println(typedText);
		Thread.sleep(2000);
		driver.findElement(By.name("Insert1")).click();
		Thread.sleep(2000);
		WebElement delete=driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/table/tbody/tr/td/form[1]/table[2]/tbody/tr[2]/td[5]/input"));
		boolean res=delete.isSelected();
		if(res==true)
		{
			System.out.println("ON");
		}
		else
		{
			System.out.println("OFF");
		}
		Thread.sleep(2000);
				driver.quit();
	}

}
