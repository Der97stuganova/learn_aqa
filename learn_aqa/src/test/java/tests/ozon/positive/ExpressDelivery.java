package tests.ozon.positive;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constans.Constant.Urls.PAGE_MARKETPLACE;

/*
№2. Выбор товаров для быстрой доставки (от 1 часа)
Шаги воспроизведения:
1. Зайти в Гугл
2. Перейти по ссылке в маркетплейс Озон
3. Нажать на кнопку "Каталог"
4. Нажать на кнопку "Весь Озон"
5. В выпадающем списке выбрать "Доставка от 1 часа"
Ожидаемый результат:
На старнице Озона отображаются товары с доставкой от 1 часа.

 */
public class ExpressDelivery extends BaseTest {
    @Test
    public void thePremiumProduct() {
        basePage.goToUrl(PAGE_MARKETPLACE);
        storePage.theCatalogWidget()
                 .changeDelivery();
    }
}
