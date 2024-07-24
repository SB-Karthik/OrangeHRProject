package com.OrangeHR.pages;

import com.OrangeHR.base.BasePage;
import org.openqa.selenium.By;

public class DashboardPage extends BasePage {
    DashboardPage(){
    }
    private final By userNameOnDashboard = By.cssSelector(".oxd-userdropdown-name");
    public String loggedInUserName(){
        presenceOfElement(userNameOnDashboard);
        return getElement(userNameOnDashboard).getText();
    }

}
