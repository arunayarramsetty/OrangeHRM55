package OrangeHRM56.OrangeHRM56;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC03_loginTestTestTest

   WebDriver driver;
{
	
	
  @Test
  public void loginTest() throws Exception
	
	
  public static void AddNationalities(String Nationality_text1) throws Exception
  
  {
	    findElement(By.id("menu_admin_viewAdminModule")).click();
		findElement(By.id("menu_admin_nationality")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.id("nationality_name")).sendKeys(Nationality_text1);//step4
		findElement(By.id("btnSave")).click();	 
		
		
  }
	  
	  
	  
		public static WebElement findElement(By by) throws Exception 
		{

			WebElement elem = driver.findElement(by);  
			
			if (driver instanceof JavascriptExecutor) 
			{
			 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		 
			}
			return elem;
		}