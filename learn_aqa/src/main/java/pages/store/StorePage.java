package pages.store;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import org.junit.Assert;
import static org.openqa.selenium.By.name;


public class StorePage extends BasePage {
    public StorePage(WebDriver driver) {
        super(driver);
    }


    //                                   LOCATORS


    // поисковая строка
    private final By writeText = name("text");

    // кнопка Поиск
    private final By searchButton = By.xpath("//*[@id='stickyHeader']/div[3]/div/div/form/div[2]/button");

    // кнопка перехода в раздел "Электроника"
    private final By findSection = By.xpath("//*[@id='stickyHeader']/div[2]/div/div[1]/button/span/span");

    // кнопка "Добавить в Корзину"
    private final By inItem = By.xpath("//*[@id='layoutPage']/div[1]/div[4]/div[3]/div[2]/div[2]/div/div/div/div[4]/div/div/div/div/div/div[1]/div/button");

    // кнопка перехода в корзину
    private final By theItem = By.xpath("//*[@id='stickyHeader']/div[4]/a[2]");

    // кнопка "Добавить в Избранное"
    private final By theFavorites = By.xpath("//*[@id='layoutPage']/div[1]/div[4]/div[2]/div/div/div[2]/div/div[2]/div/button");

    // кнопка перехода в "Избранное"
    private final By myFavorites = By.xpath("//*[@id='stickyHeader']/div[4]/a[1]");

    // кнопка "Отзывы"
    private final By itsReviews = By.xpath("//*[@id='layoutPage']/div[1]/div[4]/div[2]/div/div/div[2]/div/div[1]/div[1]/div/div/div[2]/a");

    // кнопка "Каталог"
    private final By theCatalog = By.xpath("//*[@id='stickyHeader']/div[2]/div/div/button");

    // кнопка "Весь Озон"
    private final By theAllOzon = By.xpath("//*[@id='stickyHeader']/div[2]/div/div[2]/div/div[1]/div/button");

    // кнопка "Выбрать доставку на 1 час"
    private final By theDelivery = By.xpath("//*[@id=\"stickyHeader\"]/div[2]/div/div[2]/div/div[1]/div/ul/li[1]/a");


    //                                METHODS

    /*
    EnteringTextInSearchbarTest
    Написание текста в поисковой строке
    */
    public StorePage writeText(String text) {
        driver.findElement(writeText).clear();
        driver.findElement(writeText).sendKeys(text);
        driver.findElement(writeText).submit();
        return this;
    }

    /*
    EnteringTextInSearchbarTest
    Написание другого текста в поисковой строке
    */
    public StorePage writeTextSecond(String text) {
        driver.findElement(writeText).clear();
        driver.findElement(writeText).sendKeys(text);
        driver.findElement(writeText).submit();
        return this;
    }

    /*
    CheckSectionTest
    Выбрать раздел маркет-плейса
    */
    public StorePage findSection() {
        driver.findElement(findSection).click();
        return this;
    }

    /*
    PutOnTheItem
    Положить товар в корзину
    */
    public StorePage putProduct() {
        driver.findElement(inItem).click();
        driver.findElement(theItem).click();
        return this;
    }

    /*
    PutTheFavoritesTest
    Добавить товар в избранное
    */
    public StorePage putFavorites() {
        driver.findElement(theFavorites).click();
        driver.findElement(myFavorites).click();
        return this;
    }

    /*
    WriteTheReviews
    Почитать отзывы
    */
    public StorePage theReviews() {
        driver.findElement(itsReviews).click();
        return this;
    }

    /*
    ExpressDelivery
    Зайти в Каталог услуг Озона
    */
    public StorePage theCatalogWidget() {
        driver.findElement(theCatalog).click();
        return this;
    }

    /*
    ExpressDelivery
    Выбрать доставку от 1 часа
    */
    public StorePage changeDelivery() {
        driver.findElement(theAllOzon).click();
        driver.findElement(theDelivery).click();
        return this;
    }
}















