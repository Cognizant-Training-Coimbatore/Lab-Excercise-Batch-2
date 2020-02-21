package execution;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class operation {
	WebDriver driver;

	public operation(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void perform(Properties prop, String opr, String ObjectName, String ObjectType,String Value)
	{
		switch (opr.toUpperCase())
		{
		case "CLICK":
			driver.findElement(this.getObject(prop,ObjectName,ObjectType)).click();
			break;
		case "SETTEXT":
			driver.findElement(this.getObject(prop,ObjectName,ObjectType)).sendKeys(Value);
			break;
		case "GOTOURL":
			driver.get(prop.getProperty(Value));
			break;
			default:
				break;
		
		}
	}
	public By getObject(Properties prop, String ObjectName, String ObjectType)
	{
		if(ObjectType.equalsIgnoreCase("XPATH"))
		{
			return
					By.xpath(prop.getProperty(ObjectName));
		}
		else if(ObjectType.equalsIgnoreCase("ID"))
		{
			return
					By.id(prop.getProperty(ObjectName));
		}
		else if(ObjectType.equalsIgnoreCase("name"))
		{
			return
					By.name(prop.getProperty(ObjectName));
		}
		else if(ObjectType.equalsIgnoreCase("LINKTEXT"))
		{
			return
					By.linkText(prop.getProperty(ObjectName));
		}
		else if(ObjectType.equalsIgnoreCase("CSSSELECTOR"))
		{
			return
					By.cssSelector(prop.getProperty(ObjectName));
		}
		else
		{
			System.out.println("No Matches");
		}
		return null;
			
	}
	

}
