package OrangeHR.tests;

import com.OrangeHR.driver.DriverManagerTL;
import com.OrangeHR.pages.DashboardPage;
import com.OrangeHR.pages.LoginPage;
import com.OrangeHR.utils.PropetyReader;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import OrangeHR.testbase.TestBase;

import java.lang.reflect.Method;

public class LoginTest extends TestBase {
    private static final Logger logger = LogManager.getLogger(LoginTest.class);

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify the Valid Credentials are working fine")
    @Test(groups = {"QA"}, priority = 1)
    public void testLogin_negative(Method method) throws Exception {
        DriverManagerTL.getDriver().get(PropetyReader.readKey("url"));
        String expectedResult = new LoginPage().loginHRM(false).errorMessage();

        if (expectedResult.equalsIgnoreCase(expectedResult)) {
            logger.info("Failed");
            takeScreenShot(method.getName(),DriverManagerTL.getDriver());
        }
        Assertions.assertThat(expectedResult)
                .isNotBlank().isNotNull().contains(PropetyReader.readKey("expected_error"));
    }


    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify the Valid Credentials are working fine")
    @Test(groups = {"positive","P0"},priority = 2)
    public void testLogin_positive() throws Exception {
        DriverManagerTL.getDriver().get(PropetyReader.readKey("url"));
        DashboardPage dashboardPage = new LoginPage().loginHRM(true).afterLogin();
        String expectedResult = dashboardPage.loggedInUserName();
        Assertions.assertThat(expectedResult)
                .isNotBlank().isNotNull().contains(PropetyReader.readKey("expected_username"));
    }

}
