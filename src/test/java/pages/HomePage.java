package pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import utils.UtilsElement;

@DefaultUrl("https://www.rappi.com.co/")
public class HomePage extends UtilsElement {
     public String txtRappiNameBuscar = "//*[@name='search']";

     public void setInputNameBuscar (String input) {

         WebElementFacade element1 = element(By.name(txtRappiNameBuscar));
          element1.type(input);



     }

}
