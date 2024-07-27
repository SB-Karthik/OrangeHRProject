package com.OrangeHR.pages;

import com.OrangeHR.base.BasePage;
import org.openqa.selenium.By;

public class DashboardPage extends BasePage {
    DashboardPage(){
    }
    private final By userNameOnDashboard = By.cssSelector(".oxd-userdropdown-name");
    private final By delete_firstemploy = By.xpath("(//i[@class='oxd-icon bi-trash'])[1]");
    private final By delete_submit = By.xpath("//button[normalize-space()='Yes, Delete']");


//    private final By add_button = By.xpath("//button[normalize-space()='Add']");

    public String loggedInUserName(){
        presenceOfElement(userNameOnDashboard);
        return getElement(userNameOnDashboard).getText();
    }

    public DashboardPage deleteEmploy(){
            visibilityOfElementLocated(delete_firstemploy);
            clickElement(delete_firstemploy);
            clickElement(delete_submit);
        return this;
    }


}
