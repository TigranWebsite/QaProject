package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import javax.lang.model.element.Name;

public class GoogleAutoAm {

    WebDriver driver;

    @FindBy(css = "div > div.a4bIc > input")
    WebElement googleSearch;

  /*  @FindBy(id ="rso"){
        WebElement auto;
    }*/

  //  @FindBy(xpath = "//*[@*='select2-filter-make-result-5034-246']")
    // this is To type a Tesla in the dropDown search field,
    //@FindBy(xpath = "//*[@id=\"home-filters\"]/div[1]/label/span/span[1]/span/span[2]")
    @FindBy(id = "select2-filter-make-result-uabq-3508")
        WebElement carSelector;






    public GoogleAutoAm(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



    public void inputFname(String fname) {
        googleSearch.sendKeys("www.auto.am");
        googleSearch.submit();

    }

    public void autoSelectItemSelectList(String teslaItemToSelect) {
        Select select = new Select(carSelector);
       // carSelector.click();
        select.selectByValue(teslaItemToSelect);
    }


    // select Tesla
  /*  public void selectItemSelectList(String itemToSelect) {
        Select select = new Select(countrySelector);
        select.selectByValue(itemToSelect);
    }*/


}
