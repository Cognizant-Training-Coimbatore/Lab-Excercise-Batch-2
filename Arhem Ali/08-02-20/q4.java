package basic_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		driver.getTitle();
		Select n= new Select(driver.findElement(By.name("category_id")));
		n.selectByVisibleText("Databases");
		driver.findElement(By.name("DoSearch")).click();
		driver.findElement(By.linkText("Web Database Development")).click();
		 String d=driver.findElement(By.name("quantity")).getAttribute("value");
		 System.out.println(d);
		 driver.findElement(By.name("Insert1")).click();
		  boolean s=driver.findElement(By.name("Delete1_1")).isSelected();
		  System.out.println(s);
		 

	}
}
