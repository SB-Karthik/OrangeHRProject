package OrangeHR.testbase;

import com.OrangeHR.driver.DriverManagerTL;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.io.ByteArrayInputStream;


//public class TestBase {
//
//    @BeforeSuite
//    protected void setUp() {
//        DriverManagerTL.init();
//    }
//    @AfterSuite
//    protected void tearDown() {
//        DriverManagerTL.down();
//    }
//
//    protected void takeScreenShot(String name, WebDriver driver) {
//        Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
//    }
//}


public class TestBase {

    @BeforeMethod
    protected void setUp() {
        System.out.println("Initializing WebDriver...");
        DriverManagerTL.init();
        System.out.println("WebDriver initialized: " + DriverManagerTL.getDriver());
    }

    @AfterMethod
    protected void tearDown() {
        System.out.println("Tearing down WebDriver...");
        DriverManagerTL.down();
        System.out.println("WebDriver torn down.");
    }

    protected void takeScreenShot(String name, WebDriver driver) {
        Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
    }
}