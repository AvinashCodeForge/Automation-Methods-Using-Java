import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddAndDeleteElement {
    public static void main(String[] args) throws InterruptedException {
        // Set up WebDriver
        WebDriver driver = new ChromeDriver();

        // Open a webpage
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        String input = "Add Element";

        WebElement element = driver.findElement(By.xpath(String.format("//button[text()='%s']", input)));
        element.click();
        Thread.sleep(200);
        driver.quit();
    }
}
