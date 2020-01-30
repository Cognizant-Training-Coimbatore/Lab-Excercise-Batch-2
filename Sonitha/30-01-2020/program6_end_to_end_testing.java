import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program6_end_to_end_testing 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com");
		
		WebElement login = driver.findElement(By.linkText("Log in"));
		login.click();
		
		WebElement email,password;
		email = driver.findElement(By.id("Email"));
		password = driver.findElement(By.id("Password"));
		email.sendKeys("sonithakanakadas@yahoo.in");
		password.sendKeys("sample123");
		
		WebElement element = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
		element.click();
		Thread.sleep(2000);
		
		WebElement search = driver.findElement(By.id("small-searchterms"));
		search.sendKeys("computer");
		
		WebElement searchbutton = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]"));
		Thread.sleep(2000);
		
		WebElement productelement = driver.findElement(By.linkText("Build your own cheap computer"));
		productelement.click();
		
		Thread.sleep(1000);
		WebElement addtocart = driver.findElement(By.id("add-to-cart-button-72"));
		addtocart.click();
		
		Thread.sleep(1000);
		WebElement shoppingcart= driver.findElement(By.linkText("Shopping cart"));
		shoppingcart.click();
		Thread.sleep(1000);
		
		Select op1 = new Select(driver.findElement(By.xpath("//*[@id=\"CountryId\"]")));
		op1.selectByVisibleText("Canada");
		Thread.sleep(1000);
		
		Select op2 = new Select(driver.findElement(By.xpath("//*[@id=\"StateProvinceId\"]")));
		op2.selectByVisibleText("Manitoba");
		Thread.sleep(1000);
		
		
		WebElement zip = driver.findElement(By.id("ZipPostalCode"));
		zip.sendKeys("124235");
		
		
		Thread.sleep(1000);
		WebElement estimate = driver.findElement(By.name("estimateshipping"));
		estimate.click();
		Thread.sleep(1000);
		WebElement termsos = driver.findElement(By.id("termsofservice"));
		termsos.click();
		Thread.sleep(1000);
		WebElement checkout = driver.findElement(By.id("checkout"));
		checkout.click();
		Thread.sleep(1000);
		WebElement contin= driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input"));
		contin.click();
		Thread.sleep(1000);
		
		 WebElement contin2= driver.findElement(By.xpath("//*[@id=\"shipping-buttons-container\"]/input"));
		contin2.click();
		Thread.sleep(1000);
		
		 WebElement contin3= driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/input"));
		contin3.click();
		Thread.sleep(1000);
		WebElement contin4= driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/input"));
		contin4.click();
		Thread.sleep(1000);
		
		WebElement contin5= driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/input"));
		contin5.click();
		Thread.sleep(1000);
		
		
		WebElement contin6= driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/input"));
		contin6.click();
		Thread.sleep(5000);
		
		driver.quit();
		
		

	}

}
