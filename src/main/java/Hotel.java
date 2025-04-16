import java.util.*;

public class Hotel implements Iterable<AnimalComponent> {

    private List<AnimalComponent> animais = new ArrayList<>();

    public Hotel(AnimalComponent... animais) {
        this.animais = Arrays.asList(animais);
    }

    @Override
    public Iterator<AnimalComponent> iterator() {
        return animais.iterator();
    }
}
