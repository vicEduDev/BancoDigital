public class ContaPoupanca extends Conta{

    public ContaPoupanca(){
        this.agencia = 0;
        this.numero = 0;
        this.saldo = 0.0;
    }

    @Override
    double sacar(double valor) {
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
    void transferir() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'transferir'");
    }
}