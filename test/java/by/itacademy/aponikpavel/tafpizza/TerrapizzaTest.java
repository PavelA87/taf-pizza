package by.itacademy.aponikpavel.tafpizza;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TerrapizzaTest {
    @Test
    public void testOpenTerrapizzaPage(){

        String url = "https://terrapizza.by/";
        String expected = "Пицца Маргарита";
        String xPathButtonMenu = "//li[@class ='main-menu__item']/a[@href='https://terrapizza.by/menu']";
        String xPathButtonPizza = "//div[17]/a[@href='/catalog/picca']";
        String xPathButtonPizzaMargaritaAddInOrder = "//button[@data-id='364']";
        String xPathButtonOrder = "//div[@class = 'shopping-cart-btn page-cap__shopping-cart-btn']";
        String xPathPizzaMargaritaInOrder = "//div[@class='basket__products-item-name']";
        String xPathNumberOfPizzaMargaritaInOrder = "//input[@class='basket__counter-input inp-count-el-0']";

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);

        By byButtonMenu = By.xpath(xPathButtonMenu);
        WebElement webElementButtonMenu = driver.findElement(byButtonMenu);
        webElementButtonMenu.click();

        By byButtonPizza = By.xpath(xPathButtonPizza);
        WebElement webElementButtonPizza = driver.findElement(byButtonPizza);
        webElementButtonPizza.click();

        By byButtonPizzaMargaritaAddInOrder = By.xpath(xPathButtonPizzaMargaritaAddInOrder);
        WebElement webElementButtonPizzaMargaritaAddInOrder = driver.findElement(byButtonPizzaMargaritaAddInOrder);
        webElementButtonPizzaMargaritaAddInOrder.click();

        By byButtonOrder = By.xpath(xPathButtonOrder);
        WebElement webElementButtonOrder = driver.findElement(byButtonOrder);
        webElementButtonOrder.click();

        By byPizzaMargaritaInOrder = By.xpath(xPathPizzaMargaritaInOrder);
        WebElement webElementPizzaMargaritaInOrder = driver.findElement(byPizzaMargaritaInOrder);
        String actual = webElementButtonPizzaMargaritaAddInOrder.getText();

















    }
}
