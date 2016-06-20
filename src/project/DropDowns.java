package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssce\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.southwest.com/");
		driver.findElement(By.xpath("//*[@id='air-city-departure']")).sendKeys("BNA");
		driver.findElement(By.id("air-city-arrival")).sendKeys("DFW");
		driver.findElement(By.cssSelector("#air-date-departure")).sendKeys("06/22");
	    driver.findElement(By.xpath("//*[@id='air-date-return']")).click();
		

	}

}
