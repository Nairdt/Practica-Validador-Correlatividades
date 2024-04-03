import java.util.ArrayList;
import java.util.List;

public class Materia {
    private String nombreMateria;

    private List<Materia> correlativas;

    public Materia(String nombreMateria) {
        this.nombreMateria = nombreMateria;
        this.correlativas = new ArrayList<>();
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void agregarCorrelativa(Materia unaMateria){
        this.correlativas.add(unaMateria);
    }
}
