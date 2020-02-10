package ABC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class exs4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		System.out.println(driver.getTitle());
		Select comb= new Select(driver.findElement(By.name("category_id")));
		comb.selectByVisibleText("Databases");
		driver.findElement(By.name("DoSearch")).click();
		driver.findElement(By.linkText("Web Database Development")).click();
		String qua=driver.findElement(By.name("quantity")).getAttribute("value");
		System.out.println("String = "+qua);
		driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/form/p[2]/input[1]")).click();
		boolean t=driver.findElement(By.name("Delete1_1")).isSelected();
		if(t==true)
		{
			System.out.println("delete check box is selected");
		}
		else
		{
			System.out.println("delete check box is not selected");
		}
		
		Thread.sleep(3000);
		driver.quit();

	}

}
