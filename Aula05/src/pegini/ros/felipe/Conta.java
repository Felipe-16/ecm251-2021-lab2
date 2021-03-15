package pegini.ros.felipe;

public class Conta {

    Cliente cliente = new Cliente();
    int numero;
    double saldo;


    void visualizarSaldo () {
        System.out.println("Valor do saldo: " +this.saldo);
    }

    boolean sacar (double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    void depositar (double valor) {
        this.saldo += valor;
    }

    boolean transferirDinheiro (Conta destino, double valor) {
        if(this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "cliente=" + cliente +
                ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}