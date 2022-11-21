package by.itacademy.aponikpavel.tafpizza;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TerrapizzaTest {
    @Test
    public void testTerrapizzaAddInOrder() {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        TerrapizzaPage terrapizzaPage = new TerrapizzaPage(driver);
        driver.get(terrapizzaPage.URL);
        Util.waiter();

        driver.manage().window().maximize();
        Util.waiter();

        terrapizzaPage.clickCloseCookies();
        Util.waiter();

        terrapizzaPage.clickButtonMenu();
        Util.waiter();

        terrapizzaPage.clickButtonPizza();
        Util.waiter();

        terrapizzaPage.clickButtonPizzaMargaritaAddInOrder();
        Util.waiter();

        driver.get(terrapizzaPage.URL);
        Util.waiter();

        terrapizzaPage.clickButtonOrder();
        Util.waiter();

        String actual = terrapizzaPage.getTextPizzaMargaritaFromOrder();
        Util.waiter();

        Assertions.assertEquals(terrapizzaPage.EXPECTED, actual);
        driver.quit();

    }
}
