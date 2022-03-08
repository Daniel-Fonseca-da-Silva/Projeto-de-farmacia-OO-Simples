public class Cliente extends Usuario {

    private String codigo;
    private String cpf;
    private Double saldo;

    public Cliente(String nome, int idade, int senha, String codigo, String cpf, Double saldo) {
        super(nome, idade, senha);
        this.codigo = codigo;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getSaldo() {
        return saldo;
    }

}
