import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTablesAssignment {
    public static void main(String[] args) throws Exception {
        ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement table=driver.findElement(By.id("product"));
        System.out.println(table.findElements(By.tagName("tr")).size());
        System.out.println(table.findElements(By.tagName("th")).size());
        List<WebElement> row = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));

        for(int i=0; i<row.size(); i++)
            System.out.println(row.get(i).getText());
    }
}