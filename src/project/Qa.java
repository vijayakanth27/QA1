package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Qa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	WebDriver d=new FirefoxDriver();
	d.get("https://www.gmail.com/");
	d.findElement(By.xpath(".//*[@id='Email']")).sendKeys("Selenium");
	d.findElement(By.id("next")).click();
	d.findElement(By.xpath(".//*[@type='password']")).sendKeys("Zi2.@");
    d.findElement(By.name("signIn")).click();//
    
    //code to invoke the Chrome browser
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssce\\Downloads\\chromedriver.exe");
		//WebDriver d=new ChromeDriver();
		//d.get("https://www.gmail.com/");
		//d.findElement(By.xpath("//*[@id='Email']")).sendKeys("Selenium");
		//d.findElement(By.cssSelector("['#next']")).click();
		//d.findElement(By.id("#next")).sendKeys("Zi2.@");
	    //d.findElement(By.name("signIn")).click();
		
		
		
		
	}

}
