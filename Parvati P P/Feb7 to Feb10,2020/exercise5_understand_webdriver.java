import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class exercise5_understand_webdriver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[5]/td[2]/input")).sendKeys("catchmeparvati@gmail.com");
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[2]/td[2]/input")).sendKeys("parvatipassword");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[3]/td[2]/input")).sendKeys("Parvati");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[4]/td[2]/input")).sendKeys("Prakash");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[13]/td[2]/input")).sendKeys("04952352003");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[14]/td[2]/input")).sendKeys("9526741693");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[1]/td[2]/input")).sendKeys("pp@12345");
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[6]/td[2]/input")).sendKeys("address1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[7]/td[2]/input")).sendKeys("address2");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[8]/td[2]/input")).sendKeys("address3");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[9]/td[2]/input")).sendKeys("Calicut");
		Thread.sleep(1000);
		Select state=new Select(driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[10]/td[2]/select")));
		state.selectByVisibleText("Arizona");
		Thread.sleep(1000);
		Select day1=new Select(driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[12]/td[2]/select")));
		day1.selectByVisibleText("Australia");
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[11]/td[2]/input")).sendKeys("673017");
		
		
		
		
		Select language=new Select(driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[15]/td[2]/select")));
		language.selectByVisibleText("French");
		Thread.sleep(1000);
		Select Age=new Select(driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[16]/td[2]/select")));
		Age.selectByVisibleText("18-24");
		Thread.sleep(1000);
		Select Year=new Select(driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[18]/td[2]/select")));
		Year.selectByVisibleText("High School");
		Thread.sleep(1000);
		Select Income=new Select(driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[19]/td[2]/select")));
		Income.selectByVisibleText("over $75,000");
		Thread.sleep(1000);
		
		Select Gender=new Select(driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[17]/td[2]/select")));
		Gender.selectByVisibleText("Female");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[20]/td[2]/textarea")).sendKeys("Hello Im Parvati..");
		Thread.sleep(1000);
		
		
		
		
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[21]/td/input[1]")).click();
		Thread.sleep(1000);
		
       
		driver.quit();
	}

}
