package pegini.ros.felipe;

public class Main {

    public static void main(String[] args) {
	// Criando conta
        Conta c1;
        c1 = new Conta();


        c1.cliente.titular = "Felipe";
        c1.saldo = 111.98;
        c1.numero = 1234;

        // Chamando um Método
        c1.visualizarSaldo();

        // Nova Conta
        Conta c2 = new Conta();
        c2.saldo = 400;
        c2.cliente.titular = "Murilo";
        c2.visualizarSaldo();

        c1.depositar(100);
        c1.visualizarSaldo();

        if(c2.sacar(100)) {
            System.out.println("deu bom");
        }else{
            System.out.println("ruim");
        }
        c2.visualizarSaldo();

        c1.transferirDinheiro(c2, 100);
        c1.visualizarSaldo();
        c2.visualizarSaldo();

        System.out.println("c1:" + c1.toString());
        System.out.println("c2:" + c2.toString());


    }
}
