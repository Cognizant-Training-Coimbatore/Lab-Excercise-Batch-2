package selenium_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class feb8_4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		String s1=driver.getTitle();
		System.out.println(s1);
		Select combo1=new Select(driver.findElement(By.name("category_id")));
		combo1.selectByVisibleText("Databases");
		driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/form/table[2]/tbody/tr[3]/td/input")).click();
		driver.findElement(By.linkText("Web Database Development")).click();
		String a=driver.findElement(By.name("quantity")).getAttribute("value");
		System.out.println("value = "+a);
		driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/form/p[2]/input[1]")).click();
	 boolean t= driver.findElement(By.name("Delete1_1")).isSelected();
	 if(t==true)
	   {
		   System.out.println("delete ckeckbox is selected");
	   }
	   else
	   {
		   System.out.println("delete checkbox is not selected");
	   }
		Thread.sleep(5000);
		driver.quit();
	}

}
