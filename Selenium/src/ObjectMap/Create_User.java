package ObjectMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_User {
	private static WebDriver oBrowser=null;
	public static Object_Map om=null;
	
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWind();
		Createuser();
		deleteuser();
		//logout();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\guess\\eclipse-workspace\\Selenium\\software\\chromedriver.exe");
	
			
			oBrowser=new ChromeDriver();
			String fileName=".\\Object_map\\OM.properties";
			om=new Object_Map(fileName);		
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	private static void navigate()
	{
		try
		{

			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	private static void login()
	{
		try
		{
			oBrowser.findElement(om.getLocator("loginpageusername")).sendKeys("admin");
			oBrowser.findElement(om.getLocator("loginpagepassword")).sendKeys("manager");
			oBrowser.findElement(om.getLocator("loginpageloginbtn")).click();
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	private static void minimizeFlyOutWind()
	{
		try
		{
			oBrowser.findElement(om.getLocator("homepageflyoutwindow")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void Createuser()
	{
		try
		{
			oBrowser.findElement(om.getLocator("pathforusers")).click();
			Thread.sleep(2000);
			oBrowser.findElement(om.getLocator("pathforusrebutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(om.getLocator("pathforfristnamefield")).sendKeys("fjd");
			Thread.sleep(2000);
			oBrowser.findElement(om.getLocator("pathforlastnamefield")).sendKeys("hfgf");
			Thread.sleep(2000);
			oBrowser.findElement(om.getLocator("pathforemailfield")).sendKeys("ab@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(om.getLocator("pathforusername")).sendKeys("vij");
			Thread.sleep(2000);
			oBrowser.findElement(om.getLocator("pathforpassword")).sendKeys("1234");
			Thread.sleep(2000);
			oBrowser.findElement(om.getLocator("pathforretypepass")).sendKeys("1234");
			Thread.sleep(2000);
			oBrowser.findElement(om.getLocator("pathforcreateuser")).click();
			
			
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void deleteuser()
	{
		try
		{
			oBrowser.findElement(om.getLocator("parhforuser1")).click();
			Thread.sleep(4000);
			oBrowser.findElement(om.getLocator("deleteuser")).click();
			oBrowser.switchTo().alert().accept();
			Thread.sleep(4000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			oBrowser.findElement(om.getLocator("homepagelogoutlnk")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
