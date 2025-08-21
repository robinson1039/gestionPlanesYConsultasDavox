package com.davox.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.davox.ui.CorporateVoiceMaintenancePlansUi.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CorporateVoiceMaintenancePlansTask implements Task {

    private final int codigoPlan;
    private final String descripcion;
    private final int unidadesIncluidas;
    private final int cargoFijo;
    private final int valorMinutoLdnIncluido;
    private final int valorMinutoLdiIncluido;
    private final int valorMinutoLeIncluido;
    private final int valorMinutoLdnAdicional;
    private final int valorMinutoLdiAdicional;
    private final int valorMinutoLeAdicional;
    private final String planHomologoAltamira;
    private final String bonoAltamira;

    public CorporateVoiceMaintenancePlansTask(int codigoPlan, String descripcion, int unidadesIncluidas, int cargoFijo,
                                              int valorMinutoLdnIncluido, int valorMinutoLdiIncluido, int valorMinutoLeIncluido,
                                              int valorMinutoLdnAdicional, int valorMinutoLdiAdicional, int valorMinutoLeAdicional,
                                              String planHomologoAltamira, String bonoAltamira) {
        this.codigoPlan = codigoPlan;
        this.descripcion = descripcion;
        this.unidadesIncluidas = unidadesIncluidas;
        this.cargoFijo = cargoFijo;
        this.valorMinutoLdnIncluido = valorMinutoLdnIncluido;
        this.valorMinutoLdiIncluido = valorMinutoLdiIncluido;
        this.valorMinutoLeIncluido = valorMinutoLeIncluido;
        this.valorMinutoLdnAdicional = valorMinutoLdnAdicional;
        this.valorMinutoLdiAdicional = valorMinutoLdiAdicional;
        this.valorMinutoLeAdicional = valorMinutoLeAdicional;
        this.planHomologoAltamira = planHomologoAltamira;
        this.bonoAltamira = bonoAltamira;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(String.valueOf(codigoPlan)).into(TXT_CodigoPlan),
                Enter.theValue(descripcion).into(TXT_Descripcion),
                Click.on(BTN_tipoPlan),
                Click.on(BTN_opcionDinero),
                Enter.theValue(String.valueOf(unidadesIncluidas)).into(TXT_UnidadesIncluidas),
                Enter.theValue(String.valueOf(cargoFijo)).into(TXT_CargoFijo),
                Enter.theValue(String.valueOf(valorMinutoLdnIncluido)).into(TXT_ValorMinutoLdnIncluido),
                Enter.theValue(String.valueOf(valorMinutoLdiIncluido)).into(TXT_ValorMinutoLdiIncluido),
                Enter.theValue(String.valueOf(valorMinutoLeIncluido)).into(TXT_ValorMinutoLeIncluido),
                Enter.theValue(String.valueOf(valorMinutoLdnAdicional)).into(TXT_ValorMinutoLdnAdicional),
                Enter.theValue(String.valueOf(valorMinutoLdiAdicional)).into(TXT_ValorMinutoLdiAdicional),
                Enter.theValue(String.valueOf(valorMinutoLeAdicional)).into(TXT_ValorMinutoLeAdicional),
                Enter.theValue(planHomologoAltamira).into(TXT_PlanHomologoAltamira),
                Enter.theValue(bonoAltamira).into(TXT_BonoAltamira),
                Click.on(BTN_agregar)
        );
    }

    public static CorporateVoiceMaintenancePlansTask enterData(int codigoPlan, String descripcion, int unidadesIncluidas, int cargoFijo,
                                                               int valorMinutoLdnIncluido, int valorMinutoLdiIncluido, int valorMinutoLeIncluido,
                                                               int valorMinutoLdnAdicional, int valorMinutoLdiAdicional, int valorMinutoLeAdicional,
                                                               String planHomologoAltamira, String bonoAltamira) {
        return instrumented(CorporateVoiceMaintenancePlansTask.class,
                codigoPlan, descripcion, unidadesIncluidas, cargoFijo,
                valorMinutoLdnIncluido, valorMinutoLdiIncluido, valorMinutoLeIncluido,
                valorMinutoLdnAdicional, valorMinutoLdiAdicional, valorMinutoLeAdicional,
                planHomologoAltamira, bonoAltamira);
    }
}
