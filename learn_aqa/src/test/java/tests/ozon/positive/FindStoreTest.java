package tests.ozon.positive;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constans.Constant.Urls;
import static constans.Constant.Urls.PAGE_MARKETPLACE;

/*
№6. Открытие главной страницы маркетплейса Озон
Шаги воспроизведения:
1. Зайти в Гугл
2. Перейти по ссылке в маркетплейс Озон
Ожидаемый результат:
Открыта главная страница маркетплейса "Озон".
 */
public class FindStoreTest extends BaseTest {
    @Test
    public void findTheStore(){
        basePage.goToUrl(PAGE_MARKETPLACE);

    }

}
