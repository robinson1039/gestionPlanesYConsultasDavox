package com.davox.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePageUi {
    public static final Target BTN_basics = Target.the("click on the basics menu")
            .located(By.cssSelector("#opciones-menu > div:nth-child(1)"));
    public static final  Target BTN_billing = Target.the("Click on billing option")
            .located(By.cssSelector("#cdk-overlay-0 > div > div > div:nth-child(1) button"));
}
