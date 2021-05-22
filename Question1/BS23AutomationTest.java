package com.bs23exam.automation;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BS23AutomationTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String uuid = UUID.randomUUID().toString().substring(0, 6);
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.name("email_create")).sendKeys(uuid+"@abcdef.com");
		driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"id_gender1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).sendKeys("AB");
		driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("CD");
		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("abcde");
		
		new Select(driver.findElement(By.id("days"))).selectByIndex(23);
		new Select(driver.findElement(By.id("months"))).selectByVisibleText("May ");
		new Select(driver.findElement(By.id("years"))).selectByValue("1990");
		driver.findElement(By.id("newsletter")).click();
		
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("ABC");
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("DEF");
		driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("ABCDEF");
		driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("ABC Road");
		driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("B1");
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Dhaka");
		new Select(driver.findElement(By.id("id_state"))).selectByVisibleText("Florida");
		driver.findElement(By.xpath("//*[@id=\"postcode\"]")).sendKeys("10000");
		new Select(driver.findElement(By.id("id_country"))).selectByVisibleText("United States");
		driver.findElement(By.xpath("//*[@id=\"other\"]")).sendKeys("Other Info");
		driver.findElement(By.name("phone")).sendKeys("023456789");
		driver.findElement(By.id("phone_mobile")).sendKeys("02341234348");
		driver.findElement(By.id("alias")).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), "Alternative Address");
		driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
		
		driver.findElement(By.className("sf-with-ul")).click();
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/h5/a")).click();
		driver.findElement(By.cssSelector("#add_to_cart > button")).click();
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span")).click();
		driver.findElement(By.className("sf-with-ul")).click();
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[2]/h5/a")).click();
		driver.findElement(By.cssSelector("#add_to_cart > button")).click();
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();
		driver.findElement(By.name("cgv")).click();
		driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();
		driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")).click();
		driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();
	}

}
