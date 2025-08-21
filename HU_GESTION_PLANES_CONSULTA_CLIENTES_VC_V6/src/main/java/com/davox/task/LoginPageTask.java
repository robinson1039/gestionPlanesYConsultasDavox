package com.davox.task;

import com.davox.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import java.util.Map;

import static com.davox.ui.LoginPageUi.*;

public class LoginPageTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        List<Map<String, String>> dataDavoxUser;
        try {
            dataDavoxUser = Excel.leerDatos("src/test/resources/data/davox.xlsx", "davox");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(
                Enter.theValue(dataDavoxUser.get(0).get("user")).into(TXT_user),
                Enter.theValue(dataDavoxUser.get(0).get("password")).into(TXT_password),
                Click.on(BTN_accept)
        );
    }
    public static LoginPageTask on(){
        return new LoginPageTask();
    }
}
