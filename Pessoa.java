// Exercício 1: Criando uma Classe Simples
// Objetivo: Criar uma classe simples chamada Pessoa com atributos privados e métodos públicos para acessar e modificar esses atributos.
// • Crie uma classe chamada Pessoa.
// • Adicione os atributos privados nome (String) e idade (int).
// • Crie um construtor que inicialize esses atributos.
// • Adicione métodos getNome, setNome, getIdade e setIdade.

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
}
