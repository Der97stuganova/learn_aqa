package tests.ozon.positive;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constans.Constant.Urls.LINK;

/*
№3.Просмотр отзывов
Шаги воспроизведения:
/* Добавление товар в корзину
№8. Добавить товар в Избранное
Предусловие:
Опередлить карточку выбранного товара, с которым проводится тест и взять на нее ссылку
Шаги воспроизведения:
1. Пройти по ссылке выбранного товара указанного в предусловии
2. Нажать кнопку "n отзывов"
Ожидаемый результат:
Встрроенна ссылка переносит к отзывам на выбранный товар
 */
public class WriteTheReviews extends BaseTest {
    @Test
    public void writeReviews() {
        basePage.goToUrl(LINK);
        storePage.theReviews();


    }
}
