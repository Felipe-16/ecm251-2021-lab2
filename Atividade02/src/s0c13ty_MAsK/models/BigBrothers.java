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
     * Método que vai retornar a apresentção do membro
     * @return Apresentação
     */
    @Override
    public void apresentacao() {

        System.out.println(toString());
    }

    /**
     * Método que retorna a mensagem do membro
     * @param horarioAtual
     * @return a mensagem
     */
    @Override
    public void postarMensagem(Horario horarioAtual) {

        String msg1 = "Sempre ajudando as pessoas membros ou não S2!";
        String msg2 = "...";
            if (horarioAtual == Horario.NORMAL){
                System.out.println(msg1);
            }
            else{
                System.out.println(msg2);
            }
    }
}
