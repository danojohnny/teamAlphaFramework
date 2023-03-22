package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.observer.ExtentObserver;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import utils.ConfigReader;
import utils.Driver;
import utils.SeleniumUtils;

import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.Properties;

public class TestBase {
    protected static ExtentReports extentReport;
    protected static ExtentSparkReporter htmlReport;
    protected static ExtentTest logger;
    public TestBase() {
    }

    @BeforeSuite
    public void setupReport() {
        extentReport = new ExtentReports();
        String path = System.getProperty("user.dir") + "/target/extentReports/report.html";
        System.out.println(path);
        htmlReport = new ExtentSparkReporter(path);
        extentReport.attachReporter(new ExtentObserver[]{htmlReport});
    }
    @BeforeMethod (alwaysRun = true)
    public void setUpEachMethod(Method method) throws IOException {

        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Driver.getDriver().get(ConfigReader.getProperty("homepage"));
        logger = extentReport.createTest(method.getName());
    }

    @AfterMethod
            (
                    alwaysRun = true
            )
    public void tearDownMethod(ITestResult testResult) {
        if (testResult.getStatus() == 1) {
            logger.pass("TEST PASSED.");
        } else if (testResult.getStatus() == 2) {
            logger.fail("TEST FAILED.");
            logger.fail(testResult.getThrowable());
            String path = SeleniumUtils.getScreenshot("failed");
            logger.addScreenCaptureFromPath(path);
        } else {
            logger.skip("TEST SKIPPED.");
        }

        Driver.quitDriver();
    }

    @AfterSuite
    public void tearDownReport() {
        extentReport.flush();
    }
}
