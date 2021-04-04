// Felipe Ros Pegini R.A: 18.00232-3;
// Daniel Branquinho Gomes R.A: 18.02617-6;

package pegini.ros.felipe;

// Criando uma classe conta
public class Conta {
    private int idConta;
    private double saldo;

    //  Fazendo um get para pegar cada atributo
    public int getIdConta() {
        return idConta;
    }

    public double getSaldo() {
        return saldo;
    }

    // Fazendo um set para trocar cada atributo
    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    // Função que retorna os valores da classe em String
    @Override
    public String toString() {
        return "Conta{" +
                "idConta=" + idConta +
                ", saldo=" + saldo +
                '}';
    }
}
