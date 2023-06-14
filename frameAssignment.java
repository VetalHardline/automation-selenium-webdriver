import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameAssignment {
    public static void main(String[] args) throws Exception {
        ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Nested Frames")).click();
        driver.switchTo().frame("frame-top"); // Переключение на фрейм по имени
        driver.switchTo().frame("frame-middle");
        System.out.println(driver.findElement(By.id("content")).getText());
        driver.switchTo().defaultContent(); // Возвращение на основное содержимое страницы

    }
}
