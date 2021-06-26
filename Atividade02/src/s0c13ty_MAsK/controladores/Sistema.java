package s0c13ty_MAsK.controladores;

import s0c13ty_MAsK.enumerates.Horario;
import s0c13ty_MAsK.enumerates.TiposDeMembro;
import s0c13ty_MAsK.models.*;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe onde sera executado a implementacao
 */
public class Sistema {
    private static ArrayList<Membro> listaUsuario = new ArrayList<>();
    public static void main(String[] args) {
    // registrar membros check
    // informar quando perguntado o horario check
    // postar msg para todos os membros
    // chamada de relatorio -> apresentacao
        Horario horarioatual = Horario.NORMAL;
        Scanner scanner= new Scanner(System.in);
        boolean iniciar = true;

        System.out.println("Bem vindo ao sistema da MAsK_s0c13ty");
        System.out.println("Seu horário atual é: " + horarioatual);
        System.out.println("=====================================");

        while(iniciar) {

            System.out.println("Qual opção deseja executar?\n" +
                    "1 - Mudar seu horario atual \n" +
                    "2 - Cadastro de membros novos \n" +
                    "3 - Saber seu horário atual \n" +
                    "4 - Remocao de membro \n" +
                    "5 - Postar mensagens dos membros \n" +
                    "6 - Apresentação dos membros\n" +
                    "7 - Terminar sistema");
            int resp = Integer.parseInt(scanner.next());

            switch (resp){
                case 1:
                    if (horarioatual == Horario.NORMAL){
                        horarioatual = Horario.EXTRA;
                        System.out.println("Seu horário foi alterado com sucesso!");
                    }
                    else{
                        horarioatual = Horario.NORMAL;
                        System.out.println("Seu horário foi alterado com sucesso!");
                    }
                    System.out.println("Seu horario é: " + horarioatual);
                    break;

                case 2:
                    cadastroMembros();
                    break;

                case 3:
                    System.out.println("Seu horario é: " + horarioatual);
                    break;

//                case 4:
//                    Membro membro = removerMembro();
//                    System.out.println("Membro removido!");
//                    break;

                case 5:
                    for (Membro membro : listaUsuario ) {
                        membro.postarMensagem(horarioatual);
                    }
                    break;

                case 6:
                    for (Membro membro: listaUsuario) {
                        membro.apresentacao();
                    }
                    break;


                case 7:
                    iniciar = false;
                    System.out.println("===============\n" +
                            "0br1g4d0 por usar o sistema\n" +
                            "Finalizando o sistema! bons codigos");
            }

        }


    }
    // Sera implementado aqui o cadastro de membros, uma vez considerando que quem esta usando o sistema seja um dos Big Brothers
    /**
     * Metodo que cadastra os membros com o seu papel dentro do grupo
     */
    public static Membro cadastroMembros () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Deseja adicionar um novo membro?\n" +
                "1 - sim \n" +
                "2 - nao");

        int resposta = Integer.parseInt(scanner.next());

        while (resposta == 1) {

            System.out.println("Que tipo de membro gostaria de adicionar?\n" +
                    "1 - Mobile Members\n" +
                    "2 - Heavy Lifters\n" +
                    "3 - Script Guys \n" +
                    "4 - Big Brothers");
            int add = Integer.parseInt(scanner.next());

            System.out.println("Qual o nome do membro");
            String nome = scanner.next();

            System.out.println("Qual o email?");
            String email = scanner.next();

            System.out.println("Qual o ID?");
            int ID = Integer.parseInt(scanner.next());

            switch (add) {
                case 1:
                    listaUsuario.add(new MobileMembers(nome, email, ID, TiposDeMembro.Mobile_Members));

                case 2:
                    listaUsuario.add(new HeavyLifters(nome, email, ID, TiposDeMembro.Heavy_Lifters));

                case 3:
                    listaUsuario.add(new ScriptGuys(nome, email, ID, TiposDeMembro.Script_Guys));
                case 4:
                    listaUsuario.add(new BigBrothers(nome, email, ID, TiposDeMembro.Big_Brothers));
            }

            System.out.println("Voce deseja cadastrar outro membro?\n" +
                    "1 - Sim \n" +
                    "2 - Nao");
            resposta = Integer.parseInt(scanner.next());
        }
        return null;
    }
}
