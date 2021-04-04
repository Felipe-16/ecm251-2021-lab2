// Felipe Ros Pegini R.A: 18.00232-3;
// Daniel Branquinho Gomes R.A: 18.02617-6;

package pegini.ros.felipe;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Criação dos objetos
        Transacao trans = new Transacao();
        Usuarios c1 = new Usuarios();
        Usuarios c2 = new Usuarios();
        Usuarios c3 = new Usuarios();
        Scanner nomeUsuario = new Scanner(System.in);

        // Scanneando os nomes dos usuarios
        System.out.println("Coloque o nome do Usuario 1:");
         String nome1 = nomeUsuario.next();

        System.out.println("Coloque o nome do Usuario 2:");
         String nome2 = nomeUsuario.next();

        System.out.println("Coloque o nome do Usuario 3:");
         String nome3 = nomeUsuario.next();

         // Criando as contas dos usuarios
        c1.novoUsuario(nome1,"192","@gmail.com", 1111, 1000);
        c2.novoUsuario(nome2, "193", "@gmail.com",2222,250);
        c3.novoUsuario(nome3, "194", "@gmail.com", 3333, 3000);

        // Printando sistema inicial
        System.out.println("Estado inicial:");

        System.out.println("Nome da conta 1: "+ c1.getNome() + " - Saldo: " + c1.getSaldo());
        System.out.println("Nome da conta 2: "+ c2.getNome() + " - Saldo: " + c2.getSaldo());
        System.out.println("Nome da conta 3: "+ c3.getNome() + " - Saldo: " + c3.getSaldo());

        String Qrcode1 = trans.gerarQR(c1,250);

        // Executando transferencia
        trans.transferencia(c2,c1, Qrcode1);
        trans.transferencia(c3,c1, Qrcode1);
        trans.transferencia(c2,c1, Qrcode1);

        String Qrcode2 = trans.gerarQR(c2, 1000);

        trans.transferencia(c3,c2, Qrcode2);

        //Printando o sistema final
        System.out.println("Estado final:");

        System.out.println("Nome da conta 1: "+ c1.getNome() + " - Saldo: " + c1.getSaldo());
        System.out.println("Nome da conta 2: "+ c2.getNome() + " - Saldo: " + c2.getSaldo());
        System.out.println("Nome da conta 3: "+ c3.getNome() + " - Saldo: " + c3.getSaldo());






    }



}
