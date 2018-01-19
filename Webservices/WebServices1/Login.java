package testCases;

import org.openqa.selenium.By;

import base.Driver;
import base.ScreeShot;

public class Login {

	public static void launcg()
	{
		Driver.driver1().get("http://store.demoqa.com/products-page/your-account/");
	}
	public static void logoff()
	{
		Driver.drivreturn().close();
		Driver.drivreturn().quit();
	}
	public static void logging(String UN, String PWD){
		
		Driver.drivreturn().findElement(By.id("log")).sendKeys(UN);
		Driver.drivreturn().findElement(By.id("pwd")).sendKeys(PWD);
		Driver.drivreturn().findElement(By.id("login")).click();
		ScreeShot.shoot();
		Driver.drivreturn().findElement(By.id("log")).clear();
		Driver.drivreturn().findElement(By.id("pwd")).clear();
		}		
	}
