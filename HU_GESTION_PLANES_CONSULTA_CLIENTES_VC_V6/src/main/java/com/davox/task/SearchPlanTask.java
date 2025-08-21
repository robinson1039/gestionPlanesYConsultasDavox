package com.davox.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.davox.ui.CorporateVoiceMaintenancePlansUi.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchPlanTask implements Task {
    private final int codigoPlan;

    public SearchPlanTask(int codigoPlan) {
        this.codigoPlan = codigoPlan;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(String.valueOf(codigoPlan)).into(TXT_CodigoPlan),
                Click.on(BTN_agregar)
        );
    }
    public static SearchPlanTask searchPlan(int codigoPlan){
        return instrumented(SearchPlanTask.class, codigoPlan);
    }
}
