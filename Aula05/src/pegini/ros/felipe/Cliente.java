package pegini.ros.felipe;

public class Cliente {
    private String titular;

    public Cliente(String titular) {
        this.titular = titular;
    }

    private String cpf;

    @Override
    public String toString() {
        return "Cliente{" +
                "titular='" + titular + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
