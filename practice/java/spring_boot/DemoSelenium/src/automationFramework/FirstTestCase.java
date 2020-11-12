package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hi Google is launced !!");
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\KUNDAN\\Desktop\\browserDrivers\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://mail.google.com/");
		 Thread.sleep(3000);
		 driver.quit();
		 System.out.println("Execution complete");

	}

}
