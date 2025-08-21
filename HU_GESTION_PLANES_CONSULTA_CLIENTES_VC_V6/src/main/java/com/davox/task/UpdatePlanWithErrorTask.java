package com.davox.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static com.davox.ui.CorporateVoiceMaintenancePlansUi.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class UpdatePlanWithErrorTask implements Task {
    private final int unidadesIncluidas;

    public UpdatePlanWithErrorTask(int unidadesIncluidas) {
        this.unidadesIncluidas = unidadesIncluidas;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Clear.field(TXT_UnidadesIncluidas),
                Enter.theValue(String.valueOf(unidadesIncluidas)).into(TXT_UnidadesIncluidas),
                Click.on(BTN_agregar)
        );
    }

    public static UpdatePlanWithErrorTask updatedWithErrorMassage(int unidadesIncluidas){
        return instrumented(UpdatePlanWithErrorTask.class, unidadesIncluidas);
    }
}
