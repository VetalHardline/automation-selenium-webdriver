import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Assigment1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println((driver.findElement(By.id("checkBoxOption1")).isSelected()));
		Thread.sleep(3000);
		driver.findElement(By.id("checkBoxOption1")).click();
		
		System.out.println((driver.findElement(By.id("checkBoxOption1")).isSelected()));
	
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		//System.out.println(driver.findElements(By.xpath("//input[@id='checkBoxOption1']/parent::label/parent::fieldset")));
	}

}
