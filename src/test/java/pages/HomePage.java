package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import utils.UtilsElement;

@DefaultUrl("https://www.rappi.com.co/")
public class HomePage extends UtilsElement {

    public HomePage (){

    }

     public String textboxRappiBuscar = "//*[@name='search']";

  /*
    public WebElementFacade getInpunTextBoxRappiBuscar (){ return findBy(textboxRappiBuscar); }*/

    public void setInputNameBuscar (String input) {

         WebElementFacade element1 = element(By.xpath(textboxRappiBuscar));
          element1.type(input);



     }

}
