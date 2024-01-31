import java.util.ArrayList;
import java.util.List;

public class Model {
    private final List<Deskovka> seznamDeskovek =
        new ArrayList<>();

    public Model() {
        seznamDeskovek.add(new Deskovka("Carcassonne"));
        seznamDeskovek.add(new Deskovka("Catan"));
        seznamDeskovek.add(new Deskovka("Dostihy a sázky"));
    }

    public Deskovka getDeskovka(int index) {
        return seznamDeskovek.get(index);
    }
}
