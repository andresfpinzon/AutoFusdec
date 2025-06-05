package co.com.AutoFusdec.tasks.usogeneral;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

import static co.com.AutoFusdec.userinterface.estudiante.CrearEstudiante.PAGINACION_ESTUDIANTES;

public class EliminarRegistro implements Task {

    private final Target campoFiltro;
    private final Target botonEliminar;
    private final Target botonConfirmarEliminar;
    private final Target paginacion;


    public EliminarRegistro( Target campoFiltro, Target botonEliminar, Target botonConfirmarEliminar, Target paginacion) {
        this.campoFiltro = campoFiltro;
        this.botonEliminar = botonEliminar;
        this.botonConfirmarEliminar = botonConfirmarEliminar;
        this.paginacion = paginacion;
    }

    public static EliminarRegistro con(Target campoFiltro, Target botonEliminar, Target botonConfirmarEliminarEstudiante, Target paginacion) {
        return Instrumented.instanceOf(EliminarRegistro.class)
                .withProperties(campoFiltro, botonEliminar, botonConfirmarEliminarEstudiante, paginacion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String datoFiltro = actor.recall("datoFiltro");

        actor.attemptsTo(
                PaginacionInicial.conNombre("paginacion_despues_crear", paginacion),
                Click.on(campoFiltro),
                Enter.theValue(datoFiltro).into(campoFiltro),
                Click.on(botonEliminar),
                Click.on(botonConfirmarEliminar),
                PaginacionInicial.conNombre("paginacion_despues_eliminar", paginacion),
                Enter.theValue("").into(campoFiltro)
        );
    }
}

