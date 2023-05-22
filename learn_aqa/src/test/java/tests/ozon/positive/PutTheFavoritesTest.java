package tests.ozon.positive;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constans.Constant.Urls.LINK;


/*
№7. Добавить товар в Избранное
Предусловие:
Опередлить карточку выбранного товара, с которым проводится тест и взять на нее ссылку
Шаги воспроизведения:
1. Пройти по ссылке выбранного товара указанного в предусловии
2. Нажать кнопку "В избранное"
3. В шапке сайти выбрать нажать на кнопку "Избранное"
Ожидаемый результат:
Выбарнный товар присутсвует в списке избранного товара.
 */
public class PutTheFavoritesTest extends BaseTest {
    @Test
    public void putTheItem() {
        basePage.goToUrl(LINK);
        storePage.putFavorites();

    }
}
