package com.davox.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.davox.ui.CorporateVoiceMaintenancePlansUi.TXT_ErrorActualizacion;

public class DateErrorUpdatedQuestion implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        WebElementFacade mensaje = TXT_ErrorActualizacion.resolveFor(actor);
        mensaje.waitUntilVisible().waitUntilPresent();
        String rawText = mensaje.getText().trim();
        return rawText;
    }
    public static DateErrorUpdatedQuestion value(){
        return new DateErrorUpdatedQuestion();
    }
}
