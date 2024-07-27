import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Collections;

public class Temp {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
//        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://awesomeqa.com/hr/web/index.php/auth/login");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement username = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
        username.sendKeys("admin");

        WebElement password = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
        password.sendKeys("Hacker@4321");

        WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit']")));
        button.click();

//        WebElement error_text = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".oxd-text.oxd-text--p.oxd-alert-content-text")));
//        System.out.println(error_text.getText());

//        WebElement user_name = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".oxd-userdropdown-name")));
//        System.out.println(user_name.getText());

//        WebElement add = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[normalize-space()='Add']")));
        WebElement delete = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//i[@class='oxd-icon bi-trash'])[1]")));
        delete.click();
        driver.findElement(By.xpath("//button[normalize-space()='Yes, Delete']")).click();


    }
}
