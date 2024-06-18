// Exercício 2: Criando Métodos na Classe
// Objetivo: Adicionar métodos na classe Pessoa para exibir informações.
// • Adicione um método exibirInformacoes na classe Pessoa que exiba o nome e a idade da pessoa.

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}
