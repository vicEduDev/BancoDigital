abstract class Conta {
    protected int agencia;
    protected int numero;
    protected double saldo;


    public int getAgencia() {
        return this.agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public double getSaldo() {
        return this.saldo;
    }


    abstract void sacar(double valor);
    abstract void depositar(double valor);
    abstract void transferir(double valor, Conta conta);
    abstract void exibirSaldo();
}
