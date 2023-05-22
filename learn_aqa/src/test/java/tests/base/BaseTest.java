package tests.base;

import common.CommonActions;
import org.apache.hc.client5.http.cookie.Cookie;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Actions;

import pages.base.BasePage;
import pages.store.StorePage;

import static common.Config.CLEAR_COOKIES;
import static common.Config.HOLD_BROWSER_OPEN;
import static constans.Constant.TimeoutVariables.EXPLICIT_WAIT;

//@Execution(ExecutionMode.CONCURRENT)

        @TestInstance(TestInstance.Lifecycle.PER_CLASS)
        public class BaseTest {
        protected WebDriver driver = CommonActions.createDriver();
        protected BasePage basePage = new BasePage(driver);
        protected StorePage storePage = new StorePage(driver);


        @BeforeAll
        public void setUp() {
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
                }


        @AfterEach
        void clearCookiesAndlocalStorage() {
            if (CLEAR_COOKIES) {
                JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
                driver.manage().deleteAllCookies();
                javascriptExecutor.executeScript("window.sessionStorage.clear()");
            }
        }

       @AfterAll
        void close(){
       if(!HOLD_BROWSER_OPEN){
           driver.close();
       }
   }
}
