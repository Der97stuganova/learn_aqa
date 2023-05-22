package tests.ozon.positive;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constans.Constant.Urls.PAGE_MARKETPLACE;

/*
№4. Открытие раздела "Элеткроника" маркетплейса Озон.
Шаги воспроизведения:
1. Зайти в Гугл
2. Перейти по ссылке в маркетплейс Озон
3. Выбрать раздел "Электроника"
Ожидаемый результат:
Открыт раздел "Электроника".
 */

public class CheckSectionTest extends BaseTest{

    @Test
        public void findTheStore(){
            basePage.goToUrl(PAGE_MARKETPLACE);
            storePage.findSection();
        }
    }
