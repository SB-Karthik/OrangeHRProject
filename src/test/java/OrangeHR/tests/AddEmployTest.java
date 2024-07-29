package OrangeHR.tests;


import OrangeHR.testbase.TestBase;
import com.OrangeHR.driver.DriverManagerTL;
import com.OrangeHR.pages.AddEmployee;
import com.OrangeHR.pages.DashboardPage;
import com.OrangeHR.pages.LoginPage;
import com.OrangeHR.utils.PropertyReader;
import org.testng.annotations.Test;

public class AddEmployTest extends TestBase {

    @Test(priority = 1)
    public void testAdd_employ() throws Exception {
        DriverManagerTL.getDriver().get(PropertyReader.readKey("url"));
        AddEmployee addEmployee = new LoginPage().loginHRM(true).addEmployee().addDetails();

    }
    @Test(priority = 2)
    public void deleteEmployee() throws Exception {
        DriverManagerTL.getDriver().get(PropertyReader.readKey("url"));
        DashboardPage deleted = new LoginPage().loginHRM(true).afterLogin().deleteEmploy();

    }
}
