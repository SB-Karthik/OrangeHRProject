package com.OrangeHR.utils;

import com.OrangeHR.driver.DriverManagerTL;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.ByteArrayInputStream;

public class ScreenShotListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result){
//        Object testClass = result.getInstance();
//        DriverManagerTL.getDriver();    // replace with your actual test class
//
//        if (DriverManagerTL.getDriver() instanceof TakesScreenshot){
//            File screenshot = ((TakesScreenshot) DriverManagerTL.getDriver()).getScreenshotAs(OutputType.FILE);
//            String screenshotPath = "screenshots/" + result.getName()+ ".png";          // adjust the path as needed
//
//            try {
//                Files.copy(screenshot.toPath(),new File(screenshotPath).toPath(), StandardCopyOption.REPLACE_EXISTING);
//                Reporter.log("<a href='" + screenshotPath + "' target='_blank'>Screenshot</a>");
//            }catch (IOException e){
//                e.printStackTrace();
//            }
//        }

        Allure.addAttachment(result.getTestName(), new ByteArrayInputStream(((TakesScreenshot)DriverManagerTL
                .getDriver()).getScreenshotAs(OutputType.BYTES)));
    }
}
