public class ConsultaVeterinaria extends AnimalDecorator {

    public ConsultaVeterinaria(AnimalComponent animal) {
        super(animal);
    }

    @Override
    public String getServicos() {
        return getAnimal() instanceof AnimalDecorator
                ? ((AnimalDecorator) getAnimal()).getServicos() + ", Consulta"
                : "Consulta";
    }
}