   package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1_ChromeBrowser {
	public static void main(String[] args) {
		
		ChromeDriver ch = null;
		String sText =null;
		
		try {             

			System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
			ch = new ChromeDriver();
			ch.get("http://localhost/login.do");
			
			ch.manage().window().maximize();
			Thread.sleep(2000);
			
			sText = ch.findElement(By.id("headerContainer")).getText();
			if(sText.equalsIgnoreCase("Please identify yourself")) {
				System.out.println("login page open  sucessfully");
			}else {
				System.out.println("login page failed to open ");
				return;
			}
			ch.findElement(By.name("username")).sendKeys("admin");
			ch.findElement(By.name("pwd")).sendKeys("manager");
			ch.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			
			sText = ch.findElement(By.xpath("//td[@class='pagetitle']")).getText();
			if(sText.equalsIgnoreCase("Enter Time-Track")) {
				System.out.println("home page open successfully");
			}else
			{
				System.out.println("faild to open home page");
				
				return;
			}
			ch.findElement(By.id("logoutLink")).click();
			     Thread.sleep(2000);
			     
			       sText = ch.getTitle();
			       if(sText.equalsIgnoreCase("actiTIME -Login")) {
			    	   System.out.println("logout is happened and login page is display");
			       }else
			       {
			    	   System.out.println("logout failed is happened ");
			       }
			    
			ch.close();
			

		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			ch = null;
		}
	}
}
