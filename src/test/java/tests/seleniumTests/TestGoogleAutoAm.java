package tests.seleniumTests;

import base.BaseGoogleAutoAm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.GoogleAutoAm;

import java.util.HashMap;
import java.util.Map;

public class TestGoogleAutoAm extends BaseGoogleAutoAm {

    GoogleAutoAm googleAutoAm;

    @Test (priority = 1)
    public void googleAuto(){

        googleAutoAm= new GoogleAutoAm(driver);
        googleAutoAm.inputFname(""); // it will find Auto.am from Googlik
        WebElement elem1 = driver.findElements(By.xpath("//*[@* ='LC20lb MBeuO DKV0Md']")).get(0);
        elem1.click();
WebElement carDropDown=driver.findElement(By.className("select2-selection__arrow"));

carDropDown.click();
WebElement carDropDowna=driver.findElement(By.className("select2-search__field"));
carDropDowna.sendKeys("Tes");
//WebElement teslaSearch = driver.findElement(By.id("select2-filter-make-result-uabq-3508"));
//teslaSearch.submit();
WebElement srcBtn = driver.findElement(By.id("search-btn"));
srcBtn.submit();

       // googleAutoAm.autoSelectItemSelectList("Tesla");
    }

/*    @Test(priority = 2)
public void autoAm(){


    }*/

    public void googleAuto(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
  /*  public void selectItemSelectList(String itemToSelect) {
        Select select = new Select(countrySelector);
        select.selectByValue(itemToSelect);
    }*/



}
