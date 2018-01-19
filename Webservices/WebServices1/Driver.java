package base;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
	static WebDriver driver;
	
	public static WebDriver driver1()
	{
		
		ChromeOptions chromeOptions=new ChromeOptions();
		chromeOptions.addArguments("start-maximized");
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+File.separator+"Drivers"+File.separator+"chromedriver.exe");
		driver=new ChromeDriver(chromeOptions);
		return driver;
	}
	public static WebDriver drivreturn()
	{
		return driver;
	}

}
