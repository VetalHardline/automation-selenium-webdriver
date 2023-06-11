import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise_Assigment2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("Vitalik");
		driver.findElement(By.name("email")).sendKeys("testik3@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("000000");
		driver.findElement(By.id("exampleCheck1")).click();
		driver.findElement(By.id("exampleFormControlSelect1")).click();
		driver.findElement(By.xpath("//select[@class='form-control']/option[2]")).click();
		driver.findElement(By.xpath("//input[@id='inlineRadio1']")).click();
		driver.findElement(By.name("bday")).sendKeys("7122003");
		driver.findElement(By.className("btn")).click();
		System.out.println(driver.findElement(By.className("alert")).getText());
	}

}
