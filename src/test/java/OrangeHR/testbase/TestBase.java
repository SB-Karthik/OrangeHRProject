package OrangeHR.testbase;

import com.OrangeHR.driver.DriverManagerTL;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.ByteArrayInputStream;

public class TestBase {
    @BeforeSuite
    protected void setUp(){
        DriverManagerTL.init();
    }

    @AfterSuite
    protected void tearDown(){
        DriverManagerTL.down();
    }

    protected void takeScreenShot(String name, WebDriver driver){
        Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)DriverManagerTL
                .getDriver()).getScreenshotAs(OutputType.BYTES)));
    }
}
