import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class InscripcionTest {
    Materia algoritmos = new Materia("Algoritmos y Estructuras de datos");
    Materia paradigmas = new Materia("Paradigmas de programacion");

    Materia diseño = new Materia("Diseño de Sistemas");
    Materia analisisMatematico = new Materia("Analisis Matematico 1");
    Materia analisisMatematicoDos = new Materia("Analisis Matematico 2");
    Alumno unAlumno = new Alumno("Adrian Tolaba", "16004417");
    Alumno otroAlumno = new Alumno("Alumno de prueba", "1111111");
    Inscripcion unaInscripcion = new Inscripcion(unAlumno);
    Inscripcion otraInscripcion = new Inscripcion(otroAlumno);
    @Before
    public void init(){
        paradigmas.agregarCorrelativa(algoritmos);
        diseño.agregarCorrelativa(paradigmas);
        analisisMatematicoDos.agregarCorrelativa(analisisMatematico);

        unAlumno.agregarMateriasCursadas(analisisMatematico);
        otroAlumno.agregarMateriasCursadas(analisisMatematico,algoritmos,paradigmas);
        unaInscripcion.agregarMateriasInscriptas(analisisMatematicoDos,diseño);
        otraInscripcion.agregarMateriasInscriptas(analisisMatematicoDos,diseño);

    }
    @Test
    public void testotroAlumnoCumple(){
        Assert.assertEquals(otroAlumno.cumpleCorrelativas(diseño),true);
    }

    @Test
    public void testunAlumnoNoCumple(){
        Assert.assertEquals(unAlumno.cumpleCorrelativas(paradigmas), false);
    }
    @Test
    public void testMateriaSinCorrelativas(){
        Assert.assertEquals(unAlumno.cumpleCorrelativas(analisisMatematico), true);
    }
    @Test
    public void testInscripcionUnaInscripcion(){ //no va a cumplir porque no tiene las correlativas cursadas
        Assert.assertEquals(unaInscripcion.aprobada(),false);
    }
    @Test
    public void testInscripcionOtraInscripcion(){
        Assert.assertEquals(otraInscripcion.aprobada(),true);
    }
}
