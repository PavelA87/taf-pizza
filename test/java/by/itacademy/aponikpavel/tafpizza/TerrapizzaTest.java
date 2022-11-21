package by.itacademy.aponikpavel.tafpizza;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TerrapizzaTest {
    @Test
    public void testTerrapizzaAddInOrder() {

        TerrapizzaPage terrapizzaPage = new TerrapizzaPage();

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(terrapizzaPage.url);
        Util.waiter();

        driver.manage().window().maximize();
        Util.waiter();

        terrapizzaPage.clickCloseCookies(driver);
        Util.waiter();

        terrapizzaPage.clickButtonMenu(driver);
        Util.waiter();

        terrapizzaPage.clickButtonPizza(driver);
        Util.waiter();

        terrapizzaPage.clickButtonPizzaMargaritaAddInOrder(driver);
        Util.waiter();

        driver.get(terrapizzaPage.url);
        Util.waiter();

        terrapizzaPage.clickButtonOrder(driver);
        Util.waiter();

        String actual = terrapizzaPage.getTextPizzaMargaritaFromOrder(driver);
        Util.waiter();

        Assertions.assertEquals(terrapizzaPage.expected, actual);
        driver.quit();

    }
}
