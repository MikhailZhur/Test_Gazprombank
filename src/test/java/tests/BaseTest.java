package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
    @BeforeEach
    void openBrowser() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://www.gazprombank.ru";
        Configuration.screenshots = false;
    }
}
