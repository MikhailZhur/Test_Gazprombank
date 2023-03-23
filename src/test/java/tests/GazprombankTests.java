package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.remote.tracing.EventAttribute.setValue;

public class GazprombankTests extends BaseTest {

    @Test
    public void checkVisibleWindow() {
        open("");
        $("[href='https://ib.online.gpb.ru/login']").click();
        $(byText("Не могу войти")).click();
        $(".gazprom__sc-1cgyw0-0").shouldBe(Condition.visible);
    }

    @Test
    public void checkOldVersionShouldHaveTextAboutNewVersion() {
        open("");
        $("[href='https://ib.online.gpb.ru/login']").click();
        $(byText("Открыть старую версию интернет-банка")).click();
        $("div .login__info-block").shouldHave(text("Встречайте новый интернет-банк!"));
    }
}