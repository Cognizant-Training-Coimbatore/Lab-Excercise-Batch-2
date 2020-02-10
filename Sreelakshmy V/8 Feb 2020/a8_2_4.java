package basic_commands;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	public class a8_2_4 {
	 public static void main(String[] args) throws InterruptedException {
	  // TODO Auto-generated method stub
		 
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Selenium\\Selenium_examples\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://examples.codecharge.com/Store/Default.php");
	  driver.manage().window().maximize();
	  driver.getTitle();
	  Select combo = new Select(driver.findElement(By.name("category_id")));
	  combo.selectByVisibleText("Databases");
	  driver.findElement(By.name("DoSearch")).click();
	  Thread.sleep(3000);
	  WebElement link = driver.findElement(By.linkText("Web Database Development"));
	  link.click();
	  Thread.sleep(3000);
	  String n = driver.findElement(By.name("quantity")).getAttribute("value");
	  System.out.println(n);
	  driver.findElement(By.name("Insert1")).click();
	  Thread.sleep(3000);
	  WebElement checkbox = driver.findElement(By.name("Delete1_1"));
	  System.out.println(checkbox.isSelected());
	  driver.quit();
	}

}
