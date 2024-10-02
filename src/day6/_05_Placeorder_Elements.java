package day6;

import Utility.Basedriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _05_Placeorder_Elements  {

    public  _05_Placeorder_Elements(){
        PageFactory.initElements(Basedriver.driver, this);
        // buradaki elemanlari driver i ile bagla
    }

    @FindBy(name="search") // driver.findElement(By)
    public WebElement searchInput;

    @FindBy(xpath = "//span[text()='Add to Cart']")
    public WebElement addToCArt;

    @FindBy(linkText = "Shopping Cart")
    public  WebElement shoppingCart;

    @FindBy(linkText = "Checkout")
    public WebElement checkOut;

    @FindBy(id = "button-payment-address")
    public  WebElement continue1;

    @FindBy(id = "button-shipping-address")
    public  WebElement continue2;

    @FindBy(id = "button-shipping-method")
    public  WebElement continue3;

    @FindBy(name = "agree")
    public WebElement agree;

    @FindBy(id = "button-payment-method")
    public  WebElement continue4;

    @FindBy(id = "button-confirm")
    public WebElement confirm;

    @FindBy(xpath = "//div[@id='content']/h1")
    public WebElement screenshot;



}
