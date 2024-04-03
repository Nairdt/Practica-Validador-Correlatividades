import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private List<Materia> materiasCursadas;
    private String legajo;
    public boolean cumpleCorrelativas(Materia unaMateria){

        boolean cumple = true;
        for (Materia materiaCorrelativa : unaMateria.getCorrelativas()){
            cumple = cumple && this.materiasCursadas.contains(materiaCorrelativa);
        }
        return cumple;
    }

    public Alumno(String nombre, String legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.materiasCursadas = new ArrayList<>();
    }

    public void agregarMateriasCursadas(Materia... materias){
        this.materiasCursadas.addAll(List.of(materias));
    }
    public List<Materia> getMateriasCursadas() {
        return materiasCursadas;
    }
}
