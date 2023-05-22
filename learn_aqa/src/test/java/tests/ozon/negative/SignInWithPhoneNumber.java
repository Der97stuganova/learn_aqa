package tests.ozon.negative;

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
№1.Авторизация по номеру телефона
1. Зайти в Гугл
2. Перейти по ссылке в маркетплейс Озон
3. В шапке профиля нажать кнопку "Войти"
4. Во всплывающем окне нажать на кнопку "Войти"
Ожидаемый реузльтат:
Во всплывающем окне под полем формы ввода номера телефона появится надпись красного цвета "Некорректный формат телефона".
 */
public class SignInWithPhoneNumber extends BaseTest {
    @Test
    public void frameGosTest() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        driver.get(PAGE_MARKETPLACE);

        WebElement theSignIn = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='stickyHeader']/div[4]/div[1]")));
        theSignIn.click();

        WebElement authFrame = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='authFrame']")));
        driver.switchTo().frame(authFrame);

        WebElement theNumberPhoneSign = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type = 'submit' and contains(text(),'Войти']")));
        theNumberPhoneSign.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Некорректный формат телефона')]")));
    }
}