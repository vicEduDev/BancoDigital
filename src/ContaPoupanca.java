public class ContaPoupanca extends Conta{

    public ContaPoupanca(){
        this.agencia = 0;
        this.numero = 0;
        this.saldo = 0.0;
    }

    @Override
    void sacar(double valor) {
        if(this.saldo < valor){
            System.out.println("Não é possível sacar esse valor");
        } else{
            this.saldo -= valor;
        }
    }

    @Override
    void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    void transferir(double valor, Conta conta) {
        if(this.saldo < valor){
            System.out.println("Não é possível sacar esse valor");
        } else{
            saldo -= valor;
            conta.depositar(valor);
        }
    }

    @Override
    void exibirSaldo() {
        System.out.println("O seu saldo atual é de: R$"+getSaldo());
    }
}
