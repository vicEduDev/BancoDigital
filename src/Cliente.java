public class Cliente {
    private String nome;
    private String cpf;

    Conta contaCorrente;
    Conta contaPoupanca;
    //Construtor
    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        
        this.contaCorrente = new ContaCorrente();
        this.contaPoupanca = new ContaPoupanca();
    }

}
