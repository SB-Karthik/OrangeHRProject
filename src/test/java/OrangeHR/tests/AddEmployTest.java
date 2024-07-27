package OrangeHR.tests;


import OrangeHR.testbase.TestBase;
import com.OrangeHR.driver.DriverManagerTL;
import com.OrangeHR.pages.AddEmployee;
import com.OrangeHR.pages.DashboardPage;
import com.OrangeHR.pages.LoginPage;
import com.OrangeHR.utils.PropetyReader;
import org.testng.annotations.Test;

public class AddEmployTest extends TestBase {

    @Test
    public void testAdd_employ() throws Exception {
        DriverManagerTL.getDriver().get(PropetyReader.readKey("url"));
        new LoginPage().loginHRM(true).addEmployee().addDetails();
    }

    @Test
    public void deleteEmployee() throws Exception {
        DriverManagerTL.getDriver().get(PropetyReader.readKey("url"));
        DashboardPage dashboardPage = new LoginPage().loginHRM(true).afterLogin().deleteEmploy();
    }
}
