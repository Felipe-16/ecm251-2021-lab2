package s0c13ty_MAsK.controladores;

import s0c13ty_MAsK.enumerates.Horario;
import s0c13ty_MAsK.enumerates.TiposDeMembro;
import s0c13ty_MAsK.models.*;

import java.util.Scanner;

/**
 * Classe onde sera executado a implementacao
 */
public class Sistema {
    public static void main(String[] args) {
    // registrar membros
    // informar quando perguntado o horario
    // postar msg para todos os membros
    // chamada de relatorio -> apresentacao
        Horario horarioatual = Horario.NORMAL;
        Scanner scanner= new Scanner(System.in);

        BigBrothers c4 = new BigBrothers("Daniel", "danigatinho@gmail.com",5578, TiposDeMembro.Big_Brothers);

        System.out.println("Bem vindo ao sistema da MAsK_s0c13ty");
        System.out.println("Seu horário atual é:" + horarioatual);
        System.out.println("Deseja mudar seu horário atual?\n +"
                "1 - sim \n" +
                "2 - nao");
        int resp = Integer.parseInt(scanner.next());
        if (resp == 1) {
            horarioatual = Horario.EXTRA;
            System.out.println("Seu horário foi alterado com sucesso!");
        }
        if (resp == 2) {
            System.out.println("Seu horario ainda é: " + horarioatual);
        }
        else{
            System.out.println("Digite um número entre um dos apresentados acima.");
        }

        Scanner s = new Scanner(System.in);
        System.out.println("Qual seu tipo de usuário? Digite o número respectivo\n" +
                "0 - Encerrar o programa\n" +
                "1 - Mobile Members\n" +
                "2 - Heavy Lifters\n" +
                "3 - Script Guys \n "+
                "4 - Big Brothers");
        Scanner scan = new Scanner(System.in);

        int opcao = Integer.parseInt(scanner.next());

        if (opcao == 0){
            System.out.println("Sistema Encerrado.");
        }

        if (opcao == 1){
            c1.postarMensagem(horarioatual);
            c1.apresentacao();
        }
        if (opcao == 2){
            c2.postarMensagem(horarioatual);
            c2.apresentacao();
        }
        if (opcao == 3){
            c3.postarMensagem(horarioatual);
            c3.apresentacao();
        }
        if (opcao == 4){
            c4.postarMensagem(horarioatual);
            c4.apresentacao();
            c4.cadastroMembros();
        }
        else{
            System.out.println("Digite um número entre um dos apresentados acima.");
        }
    }
    // Possivel local onde sera implenentado o metodo de cadastrar membros
}
