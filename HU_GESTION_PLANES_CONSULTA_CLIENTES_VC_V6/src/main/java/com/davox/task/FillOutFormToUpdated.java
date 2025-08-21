package com.davox.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.davox.ui.CorporateVoiceMaintenancePlansUi.BTN_llenarFormulario;

public class FillOutFormToUpdated implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_llenarFormulario)
        );
    }
    public static FillOutFormToUpdated on(){
        return new FillOutFormToUpdated();
    }
}
