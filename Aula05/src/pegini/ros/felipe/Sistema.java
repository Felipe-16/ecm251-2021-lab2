package pegini.ros.felipe;

import java.util.Scanner;

public class Sistema {
    private boolean executarSistema;
    private Scanner scanner;
    private Conta conta;

    public void executar(){
        int opcao;
        while (executarSistema){
            exibirMenu();
            opcao = scanner.nextInt();
            avaliarOpcao(opcao);
        }
    }
    private void avaliarOpcao(int opcao){
        switch (opcao) {
            case 0:
                System.out.println("Obrigado por ter utilizado o sistema!");
                this.executarSistema = false;
                break;
            default:
                System.out.println("opçao ainda nao implementada");
                break;
        }
    }

    public Sistema(){
        this.executarSistema = true;
        this.scanner = new Scanner(System.in); // Cria um scanner para o teclado
        this.conta = new Conta("Luigi",1235, 1000);
    }

    private void exibirMenu(){
        System.out.println("Bem vindo ao MauaBank");
        System.out.println("1- Visualizar Saldo");
        System.out.println("2 - Depositar dinheiro");
        System.out.println("3 - Sacar dinheiro");
        System.out.println("4 - Transferir dinheiro");
        System.out.println("5 - Pagar conta (titulo)");
        System.out.println("0 - Encerrar sistema");

    }
}
