// Exercício 4: Sobrescrita de Métodos
// Objetivo: Sobrescrever métodos na subclasse Estudante.
// • Sobrescreva o método exibirInformacoes na classe Estudante para exibir também o curso do estudante.

public class Estudante extends Pessoa {
    private String curso;

    public Estudante(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Curso: " + curso);
    }
}
