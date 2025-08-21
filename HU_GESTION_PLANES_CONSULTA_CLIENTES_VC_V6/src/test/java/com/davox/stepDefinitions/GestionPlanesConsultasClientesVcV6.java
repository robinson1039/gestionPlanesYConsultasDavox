package com.davox.stepDefinitions;

import com.davox.models.PlanVozCorporativo;
import com.davox.questions.DateErrorUpdatedQuestion;
import com.davox.questions.PlanVozEnvioExitodoQuestion;
import com.davox.questions.ValidarDatosPlanVoz;
import com.davox.task.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import static com.davox.ui.BillingUi.TXT_redireccionPaginafacturacion;
import static com.davox.ui.CorporateVoiceMaintenancePlansUi.BTN_aceptar;
import static com.davox.ui.CorporateVoiceMaintenancePlansUi.TXT_CorporateVoiceMaintenancePlans;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.equalTo;

public class GestionPlanesConsultasClientesVcV6 {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("DavoxUser");
    }

    @Given("I am on the Davox Plus login page")
    public void iAmOnTheDavoxPlusLoginPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(
                Open.url("http://10.203.221.252/login")
        );
    }
    @When("I login with valid credentials")
    public void iLoginWithValidCredentials(io.cucumber.datatable.DataTable dataTable) {
        OnStage.theActorInTheSpotlight().wasAbleTo(
                LoginPageTask.on()
        );
    }
    @When("I click on the Básicas button and select the Facturación option")
    public void iClickOnTheBásicasButtonAndSelectTheFacturaciónOption() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ToBillingTask.on()
        );
    }
    @Then("I should be redirected to the facturation page")
    public void iShouldBeRedirectedToTheFacturationPage() {
        OnStage.theActorInTheSpotlight().should(
                seeThat("Facturación",
                        WebElementQuestion.the(TXT_redireccionPaginafacturacion),
                        isVisible()
                )
        );
    }
    @Then("hago clic en la opción Mantenimiento Plan Voz Corporativa")
    public void hagoClicEnLaOpciónMantenimientoPlanVozCorporativa() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                BillingTask.on()
        );
    }
    @Then("I should be redirected to the form to register a plan")
    public void iShouldBeRedirectedToTheFormToRegisterAPlan() {
        OnStage.theActorInTheSpotlight().should(
                seeThat("Mantenimiento Planes Voz Corporativa",
                        WebElementQuestion.the(TXT_CorporateVoiceMaintenancePlans),
                        isVisible()
                )
        );
    }
    @When("I comple the form with codigo plan {string}, descripcion {string}, unidades incluidas {string}, cargo fijo {string}, valor minuto ldn incluido {string}, valor minuto ldi incluido {string}, valor minuto le incluido {string}, valor minuto ldn adicional {string}, valor minuto ldi adicional {string}, valor minuto le adicional {string}, plan homologo altamira {string}, bono altamira {string} and click on agregar button")
    public void iCompleTheFormWithCodigoPlanDescripcionUnidadesIncluidasCargoFijoValorMinutoLdnIncluidoValorMinutoLdiIncluidoValorMinutoLeIncluidoValorMinutoLdnAdicionalValorMinutoLdiAdicionalValorMinutoLeAdicionalPlanHomologoAltamiraBonoAltamiraAndClickOnAgregarButton(
            String codigoPlan,
            String descripcion,
            String unidadesIncluidas,
            String cargoFijo,
            String valorMinutoLdnIncluido,
            String valorMinutoLdiIncluido,
            String valorMinutoLeIncluido,
            String valorMinutoLdnAdicional,
            String valorMinutoLdiAdicional,
            String valorMinutoLeAdicional,
            String planHomologoAltamira,
            String bonoAltamira) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CorporateVoiceMaintenancePlansTask.enterData(Integer.parseInt(codigoPlan),
                        descripcion,
                        Integer.parseInt(unidadesIncluidas),
                        Integer.parseInt(cargoFijo),
                        Integer.parseInt(valorMinutoLdnIncluido),
                        Integer.parseInt(valorMinutoLdiIncluido),
                        Integer.parseInt(valorMinutoLeIncluido),
                        Integer.parseInt(valorMinutoLdnAdicional),
                        Integer.parseInt(valorMinutoLdiAdicional),
                        Integer.parseInt(valorMinutoLeAdicional),
                        planHomologoAltamira,
                        bonoAltamira)
        );
    }
    @Then("I can see the message {string} and click on the aceptar button")
    public void iCanSeeTheMessageAndClickOnTheAceptarButton(String mensaje) {
        OnStage.theActorInTheSpotlight().should(
                seeThat("el mensaje de envío exitoso",
                        PlanVozEnvioExitodoQuestion.value(),
                        equalTo(mensaje))
        );

        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(BTN_aceptar)
        );
    }

    @Given("I go to the search option")
    public void i_go_to_the_search_option() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                GoToSearchTask.on()
        );
    }

    @When("I search for the plan code {string} and click the Buscar button")
    public void i_search_for_the_plan_code_and_click_the_buscar_button(String codigoPlan) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SearchPlanTask.searchPlan(Integer.parseInt(codigoPlan))
        );
    }

    @When("I click on the found plan ID")
    public void i_click_on_the_found_plan_id() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                FillOutFormToUpdated.on()
        );
    }

    @Then("the plan information should be loaded in the form")
    public void the_plan_information_should_be_loaded_in_the_form() {
    }

    @When("I update the included units to {string}  and I click the Guardar button without changing the start date")
    public void i_update_the_included_units_to_and_i_click_the_guardar_button_without_changing_the_start_date(String nuevaUnidadIncluida) {
        OnStage.theActorInTheSpotlight().attemptsTo(
            UpdatePlanWithErrorTask.updatedWithErrorMassage(Integer.parseInt(nuevaUnidadIncluida))
        );
    }

    @Then("I should see an error message {string}")
    public void i_should_see_an_error_message(String errorDateMessage) {
        OnStage.theActorInTheSpotlight().should(
                seeThat("Message error:",
                        DateErrorUpdatedQuestion.value(),
                        equalTo(errorDateMessage))
        );
    }

    @When("I update the start date")
    public void i_update_the_start_date() {
       OnStage.theActorInTheSpotlight().attemptsTo(
               UpdatedDateTask.on()
       );
    }

    @Then("I should see a success message {string}")
    public void i_should_see_a_success_message(String successMessage) {
        OnStage.theActorInTheSpotlight().should(
                seeThat("Message de registro exitoso:",
                        PlanVozEnvioExitodoQuestion.value(),
                        equalTo(successMessage))
        );
    }

    @Then("I connect to the database and verify the updated plan using the query {string} and check the values for codigo plan {string}, description {string}, included units {string}, fixed charge {string}, included minute rates {string}, {string}, {string}, and additional rates {string}, {string}, {string}, homologous plan {string}, and bond {string}")
    public void i_connect_to_the_database_and_verify_the_updated_plan_using_the_query_and_check_the_values_for_codigo_plan_description_included_units_fixed_charge_included_minute_rates_and_additional_rates_homologous_plan_and_bond(
            String query, String codigoPlan, String desciption, String nuevasUnidadesIncluidas, String fixedCharge, String LDNMinuteRate,
            String LDIMinuteRate, String LEMinuteRate, String additionalLdnMinuteValue, String additionalLdiMinuteValue, String AdditionalLeMinuteValue, String altamiraHomologousPlan,
            String altamiraBond) {
        PlanVozCorporativo esperado = new PlanVozCorporativo(
                codigoPlan,
                desciption,
                "DINERO",
                nuevasUnidadesIncluidas,
                fixedCharge,
                LDNMinuteRate,
                LDIMinuteRate,
                LEMinuteRate,
                additionalLdnMinuteValue,
                additionalLdiMinuteValue,
                AdditionalLeMinuteValue
        );

        OnStage.theActorInTheSpotlight().should(
                seeThat(ValidarDatosPlanVoz.con(esperado, codigoPlan))
        );

    }

    @Then("I connect to the database and verify the Altamira bond using the query {string}, expecting plan code {string} and bond {string}")
    public void i_connect_to_the_database_and_verify_the_altamira_bond_using_the_query_expecting_plan_code_and_bond(String string, String string2, String string3) {
    }


}
