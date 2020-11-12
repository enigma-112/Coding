package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SecondTestCase {

	public static void main(String[] args) {
		System.out.println("Hi Firefox is launched !!!!");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\KUNDAN\\Desktop\\browserDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
	//	System.out.println("Firefox is ended !!!!");

	}

}
