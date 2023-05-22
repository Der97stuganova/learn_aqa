package tests.ozon.positive;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.base.BaseTest;

import java.time.Duration;

import static constans.Constant.TimeoutVariables.EXPLICIT_WAIT;
import static constans.Constant.Urls.PAGE_MARKETPLACE;

//фрейм
/*
№9.Авторизация через Apple Id
1. Зайти в Гугл
2. Перейти по ссылке в маркетплейс Озон
3. В шапке профиля нажать кнопку "Войти"
4. Во всплывающем окне выбрать кнопку "Вход с Apple"
Ожидаемый реузльтат:
В левой части окна браузера поверх старницы маркетплейса открывается новая страница "Портал государственных услуг Российской Федерации".
 */
public class SignInWithGosUslugi extends BaseTest {
    @Test
    public void frameGosTest() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        driver.get(PAGE_MARKETPLACE);

        WebElement theSignIn = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='stickyHeader']/div[4]/div[1]")));
        theSignIn.click();

        WebElement authFrame = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='authFrame']")));
        driver.switchTo().frame(authFrame);

        WebElement theGosUslugi = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"layoutPage\"]/div[1]/div/div/div[8]/div/a")));
        theGosUslugi.click();
    }
}