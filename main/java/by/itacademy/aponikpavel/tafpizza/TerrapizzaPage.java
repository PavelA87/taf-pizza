package by.itacademy.aponikpavel.tafpizza;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TerrapizzaPage {
    public final String URL = "https://terrapizza.by/";
    public final String EXPECTED = "Пицца Маргарита Классическая 32 см";
    public final String xPathButtonMenu = "//li[@class ='main-menu__item']/a[@href='https://terrapizza.by/menu']";
    public final String xPathButtonPizza = "//div[17]/a[@href='/catalog/picca']";
    public final String xPathButtonPizzaMargaritaAddInOrder = "//button[@data-id='364']";
    public final String xPathButtonOrder = "//div[@class='shopping-cart-btn page-cap__shopping-cart-btn ']";
    public final String xPathPizzaMargaritaInOrder = "//div[@class='basket__products-item-name']";
    public final String xPathNumberOfPizzaMargaritaInOrder = "//input[@class='basket__counter-input inp-count-el-0']";
    public final String xPathCloseCookies = "//button[@class='close-icon']";
    private WebDriver driver;

    public TerrapizzaPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCloseCookies() {
        By byCloseCookies = By.xpath(xPathCloseCookies);
        WebElement webElementCloseCookies = driver.findElement(byCloseCookies);
        webElementCloseCookies.click();
    }

    public void clickButtonMenu() {
        By byButtonMenu = By.xpath(xPathButtonMenu);
        WebElement webElementButtonMenu = driver.findElement(byButtonMenu);
        webElementButtonMenu.click();
    }

    public void clickButtonPizza() {
        By byButtonPizza = By.xpath(xPathButtonPizza);
        WebElement webElementButtonPizza = driver.findElement(byButtonPizza);
        webElementButtonPizza.click();
    }
    public void clickButtonPizzaMargaritaAddInOrder() {
        By byButtonPizzaMargaritaAddInOrder = By.xpath(xPathButtonPizzaMargaritaAddInOrder);
        WebElement webElementButtonPizzaMargaritaAddInOrder = driver.findElement(byButtonPizzaMargaritaAddInOrder);
        webElementButtonPizzaMargaritaAddInOrder.click();
    }

    public void clickButtonOrder(){
        By byButtonOrder = By.xpath(xPathButtonOrder);
        WebElement webElementButtonOrder = driver.findElement(byButtonOrder);
        webElementButtonOrder.click();
    }

    public String getTextPizzaMargaritaFromOrder(){
        By byPizzaMargaritaInOrder = By.xpath(xPathPizzaMargaritaInOrder);
        WebElement webElementPizzaMargaritaInOrder = driver.findElement(byPizzaMargaritaInOrder);
        return webElementPizzaMargaritaInOrder.getText();
    }
}