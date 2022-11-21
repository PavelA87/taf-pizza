package by.itacademy.aponikpavel.tafpizza;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TerrapizzaPage {
    public String url = "https://terrapizza.by/";
    public String expected = "Пицца Маргарита Классическая 32 см";
    public String xPathButtonMenu = "//li[@class ='main-menu__item']/a[@href='https://terrapizza.by/menu']";
    public String xPathButtonPizza = "//div[17]/a[@href='/catalog/picca']";
    public String xPathButtonPizzaMargaritaAddInOrder = "//button[@data-id='364']";
    public String xPathButtonOrder = "//div[@class='shopping-cart-btn page-cap__shopping-cart-btn ']";
    public String xPathPizzaMargaritaInOrder = "//div[@class='basket__products-item-name']";
    public String xPathNumberOfPizzaMargaritaInOrder = "//input[@class='basket__counter-input inp-count-el-0']";
    public String xPathCloseCookies = "//button[@class='close-icon']";

    public void clickCloseCookies(WebDriver driver) {
        By byCloseCookies = By.xpath(xPathCloseCookies);
        WebElement webElementCloseCookies = driver.findElement(byCloseCookies);
        webElementCloseCookies.click();
    }

    public void clickButtonMenu(WebDriver driver) {
        By byButtonMenu = By.xpath(xPathButtonMenu);
        WebElement webElementButtonMenu = driver.findElement(byButtonMenu);
        webElementButtonMenu.click();
    }

    public void clickButtonPizza(WebDriver driver) {
        By byButtonPizza = By.xpath(xPathButtonPizza);
        WebElement webElementButtonPizza = driver.findElement(byButtonPizza);
        webElementButtonPizza.click();
    }
    public void clickButtonPizzaMargaritaAddInOrder(WebDriver driver) {
        By byButtonPizzaMargaritaAddInOrder = By.xpath(xPathButtonPizzaMargaritaAddInOrder);
        WebElement webElementButtonPizzaMargaritaAddInOrder = driver.findElement(byButtonPizzaMargaritaAddInOrder);
        webElementButtonPizzaMargaritaAddInOrder.click();
    }

    public void clickButtonOrder(WebDriver driver){
        By byButtonOrder = By.xpath(xPathButtonOrder);
        WebElement webElementButtonOrder = driver.findElement(byButtonOrder);
        webElementButtonOrder.click();
    }

    public String getTextPizzaMargaritaFromOrder(WebDriver driver){
        By byPizzaMargaritaInOrder = By.xpath(xPathPizzaMargaritaInOrder);
        WebElement webElementPizzaMargaritaInOrder = driver.findElement(byPizzaMargaritaInOrder);
        return webElementPizzaMargaritaInOrder.getText();
    }
}