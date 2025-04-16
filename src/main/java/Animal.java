public class Animal implements AnimalComponent {
    private String nome;
    private boolean hospedado;
    private Tutor tutor;

    public Animal(String nome, boolean hospedado, Tutor tutor) {
        this.nome = nome;
        this.hospedado = hospedado;
        this.tutor = tutor;
    }

    public String getNome() {
        return nome;
    }

    public boolean isHospedado() {
        return hospedado;
    }

    public String getNomeTutor() {
        return this.tutor.getNome();
    }
}
