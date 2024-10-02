package day7;

import Utility.Basedriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class _01_Elements {
    public _01_Elements() {
        PageFactory.initElements(Basedriver.driver, this);
    }

    @FindBy(xpath = "//span[text()='Add to Cart']")
    public List<WebElement> ProductListAddCart;


    @FindBy(css = "[class='caption']>h4")
    public List<WebElement> productListCaption;

    @FindBy(xpath = "//table[@class='table table-bordered table-hover']//tr//td[@class='text-left']/a")
    public List<WebElement> productListBasket;

    @FindBy(xpath = "//button[@data-original-title='Add to Wish List']")
    public List<WebElement> ProductListAddWish;}
