package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//*[@id="fare_20200320"]
public class CalenderDatepicker {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\SeleniumPrograms\\div\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.goibibo.com/");
	
	driver.findElement(By.id("gosuggest_inputSrc")).sendKeys("Delhi(DEL)");
	driver.findElement(By.id("gosuggest_inputSrc")).sendKeys("Mumbai(BOM)");
    
	driver.findElement(By.id("departureCalendar")).click();
	
	

	String beforexpathfrom="//*[@id='fare_202003";
	String afterxpathto="']";
	
	   String day="26";
		for(int d=26;d<=31;d++) {
			String dayVal = driver.findElement(By.xpath(beforexpathfrom+d+afterxpathto)).getText();
			System.out.println(dayVal);
			if(dayVal.equals(day)) {
				driver.findElement(By.xpath(beforexpathfrom+d+afterxpathto)).click();
				break;
			}
		}
		
	driver.findElement(By.id("returnCalendar")).click();
	driver.findElement(By.id("fare_20200328")).click();
	
	driver.findElement(By.id("pax_link_common")).click();
	
	int maxadult=5;
	for(int i=1;i<=maxadult;i++) {
		driver.findElement(By.id("adultPaxPlus")).click();
	}
	int maxchild=1;
	for(int i=1;i<=maxchild;i++) {
		driver.findElement(By.id("childPaxPlus")).click();
	}
	int maxinfant=1;
	for(int i=1;i<=maxinfant;i++) {
		driver.findElement(By.id("infantPaxPlus")).click();
	}
	
	Select s=new Select(driver.findElement(By.id("gi_class")));
	s.selectByVisibleText("Premium Economy");
	
	driver.findElement(By.id("gi_search_btn")).click();
	
	
}
}
