package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.HomeSteps;

public class SearchDefinition {
    @Steps   //Clases de pasos
    private HomeSteps HomeSteps;


    @Given("^Estoy en la pagina de inicio de rappi$")
    public void estoy_en_la_pagina_de_inicio_de_rappi() {
        HomeSteps.goToHomePage();

    }


    @When("^Realizo la busqueda de restaurante en rappi // accion$")
    public void realizo_la_busqueda_de_restaurante_en_rappi_accion() {
        HomeSteps.goToTxtBuscar();

    }

    @Then("^Deberian aparecer los resultados de la busqueda$")
    public void deberian_aparecer_los_resultados_de_la_busqueda() {
        // Write code here that turns the phrase above into concrete actions

    }
}
