package com.cucumber.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	
	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\test\\resource\\com\\cucumber\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://demo.automationtesting.in/Frames.html");
			
			WebElement frame = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
			driver.switchTo().frame(0);
			System.out.println("frame done");
			
			Thread.sleep(5000);
			WebElement home = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
			home.sendKeys("1232323");
			System.out.println("home link Click done");
	}

}
