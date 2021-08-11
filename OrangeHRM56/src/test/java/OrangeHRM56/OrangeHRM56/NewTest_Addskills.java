package OrangeHRM56.OrangeHRM56;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class NewTest_Addskills {
	
  static WebDriver driver;
	
	
  @Test
  public static void loginTest() throws Exception
	{

		NewTest_Addskills T1 = new NewTest_Addskills();
		
		NewTest_Addskills.OpenChromeBroswer();
		NewTest_Addskills.Login();
		NewTest_Addskills.AddOrganization();
		
		
	}
  
  public static void OpenChromeBroswer() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
	}
	  
	 
  public static void Login() throws Exception
	{
		findElement(By.id("txtUsername")).sendKeys("Admin");
		findElement(By.id("txtPassword")).sendKeys("admin123");
		findElement(By.id("btnLogin")).click();
  }
  
  public static void AddOrganization() throws Exception
	{
		findElement(By.id("menu_admin_viewAdminModule")).click();
		findElement(By.id("menu_admin_Organization")).click();
		findElement(By.id("menu_admin_Qualifications")).click();
		findElement(By.id("menu_admin_viewSkills")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.id("skill_name")).sendKeys("Java56");
		findElement(By.id("skill_description")).sendKeys("Java56 Desc");
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
  
  
}
