package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fligthticket_booking {

	public static void main(String[] args) {

		ChromeDriver ch = null;
		String sText =null;
		
		try {
			System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
			ch = new ChromeDriver();
			ch.get("https://www.google.com/");
			ch.manage().window().maximize();
			Thread.sleep(2000);
			
			ch.findElement(By.id("https://5movierulz.mu/")).click();
			Thread.sleep(2000);
//			
//			ch.findElement(By.id("SignIn")).click();
//			Thread.sleep(2000);
//			
//			ch.findElement(By.className("email")).sendKeys("arunmanasu7@gmail.com");
//			ch.findElement(By.id("password")).sendKeys("Arun3594#");
//			ch.findElement(By.id("signInButton")).click();
//			Thread.sleep(2000);
//
//
	}catch(Exception e)
		{
			System.out.println(e);
		}
//		finally {
//			try {
//				 ch = null;
//			   sText =null;
//				
//				
//		}catch(Exception e)
//		{
//			System.out.println(e);
//		}
//		}

	}

}
