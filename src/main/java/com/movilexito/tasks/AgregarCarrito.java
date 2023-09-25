package com.movilexito.tasks;

import com.movilexito.interactions.ExplicitWait;
import com.movilexito.interactions.ScrollingBajar;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class AgregarCarrito implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ScrollingBajar.on(),
                ExplicitWait.here(5)
        );
            }
    public static AgregarCarrito onMovilExito(){
        return Instrumented.instanceOf(AgregarCarrito.class).withProperties();
    }
}
