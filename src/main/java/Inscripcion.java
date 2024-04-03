import java.util.ArrayList;
import java.util.List;

public class Inscripcion {
    private List<Materia> materiasInscriptas;
    private Alumno alumnoInscripto;
    public boolean aprobada()
    {
        boolean aprobada = true;
        for(Materia unaMateria : this.materiasInscriptas){
            aprobada = aprobada && alumnoInscripto.cumpleCorrelativas(unaMateria);
        }
        return aprobada;
    }

    public Inscripcion(Alumno alumnoInscripto) {
        this.alumnoInscripto = alumnoInscripto;
        this.materiasInscriptas = new ArrayList<>();
    }
    public void agregarMateriasInscriptas(Materia... materias){
        this.materiasInscriptas.addAll(List.of(materias));
    }
}
