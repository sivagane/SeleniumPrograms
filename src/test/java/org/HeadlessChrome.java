package org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChrome {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\jegan\\eclipse-workspace\\Selenium Examples\\div\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("window-size=1400,800");
	options.addArguments("headless");
	
	
	WebDriver d=new ChromeDriver(options);
	d.get("http:\\www.facebook.com");
	System.out.println(d.getTitle());
	
	d.findElement(By.id("email")).sendKeys("sivag918@gmail.com");
	d.findElement(By.id("pass")).sendKeys("08091990");
	d.findElement(By.id("loginbutton")).click();
	Thread.sleep(3000);
	System.out.println(d.getTitle());
}
}
