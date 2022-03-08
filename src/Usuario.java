public class Usuario {

    private String nome;
    private int idade;
    private int senha;

    public Usuario(String nome, int idade, int senha) {
        this.nome = nome;
        this.idade = idade;
        this.senha = senha;
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

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

}
