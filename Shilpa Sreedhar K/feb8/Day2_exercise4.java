package seleniumeg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day2_exercise4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		Select combo1=new Select(driver.findElement(By.name("category_id")));
		combo1.selectByVisibleText("Databases");
		Thread.sleep(2000);
		driver.findElement(By.name("DoSearch")).click();
		Thread.sleep(2000);
		WebElement reg=driver.findElement(By.linkText("Web Database Development"));
		reg.click();
		Thread.sleep(2000);
		String s= driver.findElement(By.name("quantity")).getAttribute("value");
		//WebElement total=driver.findElement(By.name("quantity"));
		System.out.println(s);
		driver.findElement(By.name("Insert1")).click();
		Thread.sleep(2000);
		WebElement delet=driver.findElement(By.name("Delete1_1"));
		boolean res=delet.isSelected();
		if (res==true)
		{
			System.out.println("ON");
		}
		else
		{
			System.out.println("OFF");
		}
		Thread.sleep(5000);
		driver.quit();
		
		
		

	}

}
