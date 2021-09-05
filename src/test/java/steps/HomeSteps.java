package steps;

import net.thucydides.core.annotations.Step;
import pages.HomePage;

public class HomeSteps {

    private HomePage mHomePage;

    @Step   //Serenity entienda que es 1 paso
    public void goToHomePage(){
        mHomePage.open();

    }

   @Step
    public void goToTxtBuscar(){
        mHomePage.setInputNameBuscar("Restaurante");

    }

    /* @Step
    public void SetTextinTextBoxBuscar(String text){ mHomePage.getInpunTextBoxRappiBuscar().typeAndEnter(text);}*/


}
