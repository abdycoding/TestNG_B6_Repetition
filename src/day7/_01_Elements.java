package day7;

import Utility.Basedriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
/*
     Bu sayfadaki bütün elemanların driverlar bağlantısı gerekiyor
     bunun için aşağıdaki consructor eklendi ve için PageFatory ile
     driver üzerinden bu (this) sayfadaki bütün elemnalar ilşkilendirildi.
     Böylece Sayfada dan nesne türetildiği zaman değil, kullanıldığı
     anda elemanların bulunması aktif oluyor.Bu yöntemle bütün sayfalarda
     aynı isimde elemanlar var ise buradaki tanımlama hepsi için geçerli hale
     gelmiş oluyor. buna yapıya Page Object Model (POM) adı veriliyor.
     Faydaları: kod düzeni daha rahat, aynı locatorlar için tek bir tanımlama, kullanıldığı anda bulma, ve agile için
     tam kolay çalışma yani developer başlamadan veya bitirmesini beklemeden sen kodları yazabilir, ve kolaylıkla
     değişiklik yapabilirsin.
 */

public class _01_Elements {
    public _01_Elements() {
        PageFactory.initElements(Basedriver.driver, this);
    }

    @FindBy(xpath = "//span[text()='Add to Cart']")
    public List<WebElement> productListAddCart;

    @FindBy(css = "[class='caption'] >h4")
    public List<WebElement> productListCaption;

    @FindBy(xpath = "//table[@class='table table-bordered']//td[@class='text-left']/a")
    public List<WebElement> productListBasket;

    @FindBy(xpath = "//button[@data-original-title='Add to Wish List']/i")
    public List<WebElement> productListAddWish;

    @FindBy(linkText = "wish list")
    public WebElement wishList;

    @FindBy(css = "[class='table table-bordered table-hover'] td[class='text-left']>a")
    public List<WebElement> productListWish;
}