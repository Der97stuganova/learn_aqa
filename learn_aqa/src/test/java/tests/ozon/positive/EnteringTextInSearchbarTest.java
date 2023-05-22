package tests.ozon.positive;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constans.Constant.Words.*;
import static constans.Constant.Urls.*;

/*
№5. Поочередный ввод  и удаление текста на русскими и английскими буквами
Шаги воспроизведения:
1. Зайти в Гугл
2. Перейти по ссылке в маркетплейс Озон
3. Ввести текст в строку поиска
5. Нажать "Поиск"
6. Очистить строку поиска
7. Ввести текст английскими буквами в строку поиска
8. Нажать "Поиск"
Ожидаемый результат:
Текст, введенный буквами английского и русского алфавита успешно набирается и стирается.
 */

public class EnteringTextInSearchbarTest extends BaseTest {
    @Test
    public void enteringTextIntoTheSearchbar() {
        basePage.goToUrl(PAGE_MARKETPLACE);
        storePage.writeText(INPUT_WORDS_ONE)
                 .writeTextSecond(INPUT_WORDS_SECOND);

    }
}
