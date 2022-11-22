package by.itacademy.aponikpavel.tafpizza;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TerrapizzaTest extends BaseTest {
    @Test
    public void testTerrapizzaAddInOrder() {

        TerrapizzaPage terrapizzaPage = new TerrapizzaPage(driver);

        terrapizzaPage.openTerrapizzaPage();
        terrapizzaPage.clickCloseCookies();
        terrapizzaPage.clickButtonMenu();
        terrapizzaPage.clickButtonPizza();
        terrapizzaPage.clickButtonPizzaMargaritaAddInOrder();
        terrapizzaPage.clickButtonOrder();
        Util.waiter();

        String actualPizzaInOrder = terrapizzaPage.getTextPizzaMargaritaFromOrder();

        Assertions.assertEquals(terrapizzaPage.EXPECTED, actualPizzaInOrder);

    }
}
