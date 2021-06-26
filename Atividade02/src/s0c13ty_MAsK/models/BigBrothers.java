package s0c13ty_MAsK.models;

import s0c13ty_MAsK.enumerates.Horario;
import s0c13ty_MAsK.enumerates.TiposDeMembro;

import java.util.Scanner;

/**
 * Classe dos Big brothers que são os responsaveis
 */

public class BigBrothers extends Membro{

    /**
     * Construtor da classe Big Brothers
     *
     * @param nome
     * @param email
     * @param ID
     * @param funcao
     */
    public BigBrothers(String nome, String email, int ID, TiposDeMembro funcao) {
        super(nome, email, ID, funcao);
    }

    /**
     * Metodo que cadastra os membros com o seu papel dentro do grupo
     */
    public void cadastroMembros () {
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

                        MobileMembers novoMembro = new MobileMembers(nome, email, ID, TiposDeMembro.Mobile_Members);
                        System.out.println(novoMembro.toString());
                        break;

                    case 2:

                        HeavyLifters novoMembro2 = new HeavyLifters(nome, email, ID, TiposDeMembro.Heavy_Lifters);
                        System.out.println(novoMembro2.toString());
                        break;

                    case 3:

                        ScriptGuys novoMembro3 = new ScriptGuys(nome, email, ID, TiposDeMembro.Script_Guys);
                        System.out.println(novoMembro3.toString());
                        break;
                    case 4:

                        BigBrothers novoMembro4 = new BigBrothers(nome, email, ID, TiposDeMembro.Big_Brothers);
                        System.out.println(novoMembro4.toString());
                        break;
                }

            System.out.println("Voce deseja cadastrar outro membro?\n" +
                    "1 - Sim \n" +
                    "2 - Nao");
            resposta = Integer.parseInt(scanner.next());
        }
    }

    /**
     * Método que vai retornar a apresentção do membro
     * @return Apresentação
     */
    @Override
    public void apresentacao() {

        System.out.println(toString());
    }

    /**
     * Método que retorna a mensagem do membro
     * @param horario
     * @return a mensagem
     */
    @Override
    public void postarMensagem(Horario horario) {

        String msg1 = "“Sempre ajudando as pessoas membros ou não S2!";
        String msg2 = "...";
            if (horario == Horario.NORMAL){
                System.out.println(msg1);
            }
            else{
                System.out.println(msg2);
            }
    }
}
