package com.davox.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPageUi {
    public static final Target TXT_user = Target.the("enter the user name")
            .located(By.cssSelector("input[placeholder=\"Usuario\"]"));
    public static final Target TXT_password = Target.the("enter the password")
            .located(By.cssSelector("input[placeholder=\"Contraseña\"]"));
    public static final Target  BTN_accept = Target.the("Click on accept button")
            .located(By.cssSelector("div[class=\"boton\"] button"));
}