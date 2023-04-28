package Sel2_Sg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_logout {
	public static WebDriver oBroswer=null;
	public static void main(String[] args) {

		LaunchBros(); 
		navigate();
		login();

		UserCraete();
	    logout();
	}
	private static void LaunchBros() {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\guess\\eclipse-workspace\\Selenium\\software\\chromedriver.exe");

			oBroswer=new ChromeDriver();
		}catch(Exception e) {
			e.printStackTrace();

		}
	}
	private static void navigate() {
		try {
			oBroswer.get("http://localhost:81/login.do");
			Thread.sleep(1000);

		}catch(Exception e){
			e.printStackTrace();


		}
	}
	private static void login() {
		try {
			oBroswer.findElement(By.className("textField")).sendKeys("admin");
			oBroswer.findElement( By.name("pwd")).sendKeys("manager");
			oBroswer.findElement(By.linkText("Login")).click();
			Thread.sleep(5000);
			oBroswer.findElement(By.xpath("//*[@id=\"gettingStartedShortcutsPanelId\"]")).click();
			Thread.sleep(2000);

		}catch(Exception e){
			e.printStackTrace();

		}
	}

	private static void UserCraete() {
		try {
						oBroswer.findElement(By.xpath("//div[text()='USERS']")).click();
						oBroswer.findElement(By.xpath("//div[text()='Add User']")).click();
						oBroswer.findElement(By.name("firstName")).sendKeys("vijay");
						oBroswer.findElement(By.name("lastName")).sendKeys("k");
						oBroswer.findElement(By.name("email")).sendKeys("vijay@123");
						oBroswer.findElement(By.name("username")).sendKeys("dkd");
		}catch(Exception e){
			e.printStackTrace();
		}
}

	
	private static void logout() {
	try {
					oBroswer.findElement(By.id("logoutLink")).click();
					Thread.sleep(15000);

	}catch(Exception e){
		e.printStackTrace();
	}
}
}