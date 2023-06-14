import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assigment_6 {
    public static void main(String[] args) throws Exception {
        ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.id("checkBoxOption2")).click();
        String option = driver.findElement(By.xpath("//label[@for='benz']")).getText();
        driver.findElement(By.id("dropdown-class-example")).click();

        WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
        Select abc = new Select(dropdown);
        abc.selectByVisibleText(option);

        driver.findElement(By.id("name")).sendKeys(option);
        driver.findElement(By.id("alertbtn")).click();
        String alertText = driver.switchTo().alert().getText();

        if(alertText.contains(option))
            System.out.println("Option2 exists in alert");
        else
            System.out.println("Something wrong");
    }
}
