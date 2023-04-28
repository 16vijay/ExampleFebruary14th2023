package Sel2_Sg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {
	
public static WebDriver oBroswer=null;
		public static void main(String[] args) {
	
launchBroswer();
navigate();
closeapplication();
	}
	
	private static void launchBroswer() {
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
		Thread.sleep(10000);
		}catch(Exception e) {
			e.printStackTrace();
		}	
		}
		private static void closeapplication() {
			try {
				oBroswer.close();
			
			}catch(Exception e) {
				e.printStackTrace();
				
}
		}
	}
