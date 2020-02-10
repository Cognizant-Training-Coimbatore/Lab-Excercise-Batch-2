package exercise;


import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selenium_Q5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/admin/Downloads/sample.html.htm");
		
		Select product = new Select(driver.findElement(By.tagName("select")));
		int size = product.getOptions().size();
		product.selectByVisibleText("Mango");
		System.out.println(size);
		driver.findElement(By.id("txt1")).sendKeys("7");
		 
		java.util.List<WebElement> links = driver.findElements(By.xpath("//a"));
		int linkCount = links.size();
		System.out.println("Link count : " + linkCount);
		
		java.util.List<WebElement> boxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
        int count1 = boxes.size();
        System.out.println("number of checkbox :"+count1);
        
        driver.findElement(By.id("t2")).sendKeys("3");
        
        Random rand = new Random();
        int index = rand.nextInt(count1);
        boxes.get(index).click();
        
        String title = driver.getTitle();
        System.out.println("Title : " + title);
        
        System.out.println("The hobbies which are not selected are : ");
     
	        WebElement rememberme = driver.findElement(By.id("check1"));
			boolean res = rememberme.isSelected();
			if(res==false)
				System.out.print(rememberme + "    ");
			WebElement rememberme1 = driver.findElement(By.id("check2"));
			boolean res1 = rememberme1.isSelected();
			if(res1==false)
				System.out.print(rememberme1 + "    ");
			WebElement rememberme2 = driver.findElement(By.id("check3"));
			boolean res2 = rememberme2.isSelected();
			if(res2==false)
				System.out.print(rememberme2 + "    ");
			
        Thread.sleep(3000);
        driver.close();
	}

}

