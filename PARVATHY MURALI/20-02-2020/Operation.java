package execution;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//get the objects, elements(from "By" object), readthe action and what are the action.... 
//used for any actions
public class Operation 
{
	WebDriver driver;
	public Operation(WebDriver driver2) 
	{
		this.driver=driver;
		
	}
	public By perform(Properties prop, String opr, String ObjectName, String ObjectType, String Value)
	{
		switch(opr.toUpperCase())
		{
		case "CLICK":
			driver.findElement(this.getObject(prop,ObjectName, ObjectType)).sendKeys(Value);
			break;
		case "SETTEXT":
			driver.findElement(this.getObject(prop,ObjectName, ObjectType)).sendKeys(Value);
			break;
		case "GOTOURL":
			driver.findElement(this.getObject(prop,ObjectName, ObjectType)).click();
			break;
			default:
				break;
				
		}
		return null;
		
	}
	public By getObject(Properties prop, String ObjectName, String ObjectType)
	{
		if(ObjectType.equalsIgnoreCase("XPATH"))
		{
			return	By.xpath(prop.getProperty(ObjectName));
			
		}
		else if(ObjectType.equalsIgnoreCase("ID"))
		{
			return	By.xpath(prop.getProperty(ObjectName));
			
		}
		else if(ObjectType.equalsIgnoreCase("name"))
		{
			return	By.xpath(prop.getProperty(ObjectName));
			
		}
		else if(ObjectType.equalsIgnoreCase("LINKTEXT"))
		{
			return	By.xpath(prop.getProperty(ObjectName));
			
		}
		else if(ObjectType.equalsIgnoreCase("CSSELECTOR"))
		{
			return	By.xpath(prop.getProperty(ObjectName));
			
		}
		else
		{
			System.out.println("No Matches");	
		}
		return null;
	}

}
