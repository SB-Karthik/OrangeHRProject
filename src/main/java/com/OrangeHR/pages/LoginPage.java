package com.OrangeHR.pages;

import com.OrangeHR.base.BasePage;
import com.OrangeHR.driver.DriverManagerTL;
import com.OrangeHR.utils.PropetyReader;
import org.openqa.selenium.By;


public class LoginPage extends BasePage {
    public LoginPage(){
        super();

    }

    private final By username = (By.name("username"));
    private final By password = (By.name("password"));
    private final By login_cta = By.cssSelector("button[type='submit']");
    private final By error_message = By.cssSelector(".oxd-text.oxd-text--p.oxd-alert-content-text");


    public LoginPage loginHRM(boolean invalid) throws Exception {
        if (!invalid){
            presenceOfElement(username);
            enterInput(username, PropetyReader.readKey("invalid_username"));
        }else {
            elementToBeClickable(login_cta);
            enterInput(username, PropetyReader.readKey("username"));
        }

        enterInput(password, PropetyReader.readKey("password"));
//        elementToBeClickable(login_cta);
        clickElement(login_cta);
        return this;
    }

    public String errorMessage() throws InterruptedException {
        visibilityOfElementLocated(error_message);
        return DriverManagerTL.getDriver().findElement(error_message).getText();
    }

    public DashboardPage afterLogin(){
        return new DashboardPage();
    }

    public AddEmployee addEmployee(){
        return new AddEmployee();
    }



}
