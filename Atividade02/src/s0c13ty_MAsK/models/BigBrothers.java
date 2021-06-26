package s0c13ty_MAsK.models;

import s0c13ty_MAsK.enumerates.Horario;
import s0c13ty_MAsK.enumerates.TiposDeMembro;

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
    // Quando cadastrados, os script guys devem mandar uma mensagem de boas vindas
    final void cadastroMembros () {

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
    public String postarMensagem(Horario horario) {

        String msg1 = "“Sempre ajudando as pessoas membros ou não S2!";
        String msg2 = "...";
        if (horario == Horario.NORMAL){
            return msg1;
        }
        else{
            return msg2;
        }
    }
}
