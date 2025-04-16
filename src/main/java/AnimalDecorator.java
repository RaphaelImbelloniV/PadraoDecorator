public abstract class AnimalDecorator implements AnimalComponent {
    private AnimalComponent animal;

    public AnimalDecorator(AnimalComponent animal) {
        this.animal = animal;
    }

    public AnimalComponent getAnimal() {
        return this.animal;
    }

    public String getNome() {
        return animal.getNome();
    }

    public boolean isHospedado() {
        return animal.isHospedado();
    }

    public String getNomeTutor() {
        return animal.getNomeTutor();
    }

    public abstract String getServicos();

    public String getDescricaoCompleta() {
        return animal.getNome() + " (" + getServicos() + ")";
    }
}