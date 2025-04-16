public class Banho extends AnimalDecorator {

    public Banho(AnimalComponent animal) {
        super(animal);
    }

    @Override
    public String getServicos() {
        return getAnimal() instanceof AnimalDecorator
                ? ((AnimalDecorator) getAnimal()).getServicos() + ", Banho"
                : "Banho";
    }
}