import java.time.Duration;
import java.util.List;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_adding_Goods_In_Cart {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//label[@class='customradio'][2]")).click();
		
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		
		driver.findElement(By.id("okayBtn")).click();
		driver.findElement(By.xpath("//select[@class='form-control']")).click();
		driver.findElement(By.xpath("//option[@value='consult']")).click();
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		List <WebElement> smartphones = driver.findElements(By.xpath("//button[@class='btn btn-info']")); 
		
		for(int i=0; i<smartphones.size(); i++){
			smartphones.get(i).click();
		}
		
		
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
	}
	
}
