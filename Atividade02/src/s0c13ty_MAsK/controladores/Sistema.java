package s0c13ty_MAsK.controladores;

import s0c13ty_MAsK.enumerates.Horario;
import s0c13ty_MAsK.enumerates.TiposDeMembro;
import s0c13ty_MAsK.models.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe onde será executado a implementação
 */
public class Sistema {
    private static ArrayList<Membro> listaMembros = new ArrayList<>();

    /**
     * Método que vai exibir o meno do sistema
     * @throws IOException - caso o sistema não funcione
     */
    public static void run() throws IOException {

        Horario horarioatual = Horario.NORMAL;
        Scanner scanner = new Scanner(System.in);
        boolean iniciar = true;

        System.out.println("Bem vindo ao sistema da MAsK_s0c13ty");
        System.out.println("Seu horário atual é: " + horarioatual);
        System.out.println("=====================================");

        /**
         * While para sempre executar o sistema até que o usuário encerre o sistema
         */
        while(iniciar) {

            System.out.println("Qual opção deseja executar?\n" +
                    "1 - Mudar seu horario atual \n" +
                    "2 - Cadastro de membros novos \n" +
                    "3 - Saber seu horário atual \n" +
                    "4 - Remocao de membro \n" +
                    "5 - Postar mensagens dos membros \n" +
                    "6 - Apresentação dos membros\n" +
                    "7 - Terminar sistema");
            int resp = scanner.nextInt();

            /**
             * Switch case para cada execução do menu
             */
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
                    System.out.println("Seu horário é: " + horarioatual);
                    break;

                case 2:
                    cadastroMembros();
                    break;

                case 3:
                    System.out.println("Seu horário é: " + horarioatual);
                    break;

                case 4:
                    removerMembro();
                    System.out.println("Membro removido!");
                    break;

                case 5:
                    for (Membro membro : listaMembros) {
                        System.out.println(membro.getNome());
                        membro.postarMensagem(horarioatual);
                    }
                    break;

                case 6:
                    for (Membro membro: listaMembros) {
                        membro.apresentacao();
                    }
                    break;


                case 7:
                    Arquivamento arquivamento = new Arquivamento();
                    arquivamento.arquivar(listaMembros);
                    iniciar = false;
                    System.out.println("===============\n" +
                            "0br1g4d0 por usar o sistema.\n" +
                            "Finalizando o sistema! Bons códigos.");
            }
        }
    }

    // Será implementado o cadastro de membros, uma vez considerando que quem está usando o sistema seja um dos Big Brothers
    /**
     * Método que cadastra os membros com o seu papel dentro do grupo
     */
    public static void cadastroMembros () throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Deseja adicionar um novo membro?\n" +
                "1 - Sim \n" +
                "2 - Não");

        int resposta = scanner.nextInt();

        /**
         * While para executar o cadastro de membro ate que o usuário termine de usar
         */
        while (resposta == 1) {

            System.out.println("Que tipo de membro gostaria de adicionar?\n" +
                    "1 - Mobile Members\n" +
                    "2 - Heavy Lifters\n" +
                    "3 - Script Guys \n" +
                    "4 - Big Brothers");
            int add = scanner.nextInt();

            System.out.println("Qual o nome do membro?");
            String nome = scanner.next();

            System.out.println("Qual o email?");
            String email = scanner.next();

            System.out.println("Qual o ID?");
            int ID = scanner.nextInt();

            /**
             * Switch case para cadastrar membro para cada função
             */
            switch (add) {
                case 1:
                    listaMembros.add(new MobileMembers(nome, email, ID, TiposDeMembro.Mobile_Members));
                    break;

                case 2:
                    listaMembros.add(new HeavyLifters(nome, email, ID, TiposDeMembro.Heavy_Lifters));
                    break;

                case 3:
                    listaMembros.add(new ScriptGuys(nome, email, ID, TiposDeMembro.Script_Guys));
                    break;

                case 4:
                    listaMembros.add(new BigBrothers(nome, email, ID, TiposDeMembro.Big_Brothers));
                    break;
            }


            System.out.println("Você deseja cadastrar outro membro?\n" +
                    "1 - Sim \n" +
                    "2 - Não");
            resposta = scanner.nextInt();
        }
    }

    /**
     * Método para remover um membro em relação a ordem (posição) de cadastro
     */
    public static void removerMembro(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseja excluir um membro?\n" +
                "1 - Sim \n" +
                "2 - Não");
        int resposta = scanner.nextInt();

        /**
         * While para executar a remoção de membro até que o usuário termine
         */
        while (resposta == 1) {

            System.out.println("Você deseja apagar qual posição?");
            int excluir = scanner.nextInt();

            listaMembros.remove(excluir);

            System.out.println("Voce deseja remover outro membro?\n" +
                    "1 - Sim \n" +
                    "2 - Não");
            resposta = scanner.nextInt();

        }
    }
}
