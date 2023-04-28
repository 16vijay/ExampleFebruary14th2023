package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loacators2 {

	public static void main(String[] args) {
		ChromeDriver chrome = null;
		try {
			//1. Open browser and navigate to actiTime URL-> Verify URL opened
			System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
			chrome = new ChromeDriver();
			chrome.manage().window().maximize();
			chrome.navigate().to("http://localhost/login.do");
			Thread.sleep(2000);
			
			if(chrome.getTitle().equalsIgnoreCase("actiTIME - Login")) {
				System.out.println("URL is loaded and login page has opened successful");
			}else {
				System.out.println("Failed to navigate to the login URL");
				return;
			}
			
			
			
			//2. Login to actiTime application->Verify login is successful
			chrome.findElement(By.id("username")).sendKeys("admin");
			chrome.findElement(By.name("pwd")).sendKeys("manager");
			chrome.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			
			if(chrome.findElement(By.xpath("//td[@class='pagetitle']")).getText().equalsIgnoreCase("Enter Time-Track"))
			{
				System.out.println("Login to actiTime is successful");
				
				//close the shortcut window
				if(chrome.findElement(By.xpath("//div[@style='display: block;']")).isDisplayed()) {
					chrome.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
				}
			}else {
				System.out.println("Failed to login to actiTime");
				return;
			}
			
			
			
			//3. Create user--> verify user created successful
			chrome.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(2000);
			
			chrome.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			
			chrome.findElement(By.name("firstName")).sendKeys("demo");
			chrome.findElement(By.name("lastName")).sendKeys("user1");
			chrome.findElement(By.name("email")).sendKeys("demo.user1@sg.com");
			chrome.findElement(By.name("username")).sendKeys("demouser1");
			chrome.findElement(By.name("password")).sendKeys("Mercury1");
			chrome.findElement(By.name("passwordCopy")).sendKeys("Mercury1");
			
			chrome.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);
			
			if(chrome.findElement(By.xpath("//div[@class='name']/span[text()='user1, demo']")).isDisplayed()) {
				System.out.println("The new user has created successful");
			}else {
				System.out.println("Failed to create the new User in actiTime application");
				return;
			}
			
			
			
			//4. delete user-> Verify user deleted successful
			chrome.findElement(By.xpath("//div[@class='name']/span[text()='user1, demo']")).click();
			Thread.sleep(2000);
			
			chrome.findElement(By.xpath("//button[contains(text(), 'Delete User')]")).click();
			Thread.sleep(2000);
			
			chrome.switchTo().alert().accept();
			Thread.sleep(2000);
			
			if(chrome.findElements(By.xpath("//div[@class='name']/span[text()='user1, demo']")).size() >0) {
				System.out.println("Failed to delete the User in actiTime application");
				return;
			}else {
				System.out.println("The user has deleted successful");
			}
			
			
			
			//5. Logout from actiTime--> verify logout is successful
			chrome.findElement(By.xpath("//a[@id='logoutLink']")).click();
			Thread.sleep(2000);
			
			if(chrome.findElement(By.xpath("//img[contains(@src, '/timer.png')]")).isDisplayed()) {
				System.out.println("Logout from actiTime was successful");
			}else {
				System.out.println("FAiled to logout from actiTime application");
				return;
			}
			
			
			//6. close browser
			chrome.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			chrome = null;
		}

	}

}
