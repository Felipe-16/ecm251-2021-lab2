package s0c13ty_MAsK.models;

import s0c13ty_MAsK.enumerates.Horario;
import s0c13ty_MAsK.enumerates.TiposDeMembro;

/**
 * Classe dos membros que utilizam o celular
 */

public class MobileMembers extends Membro{
    /**
     * Construtor da classe Mobile Members
     *
     * @param nome
     * @param email
     * @param ID
     * @param funcao
     */
    public MobileMembers(String nome, String email, int ID, TiposDeMembro funcao) {
        super(nome, email, ID, funcao);
    }

    /**
     * Método que vai retornar a apresentção do membro
     * @return Apresentação
     */
    @Override
    public String apresentacao() {

        return null;
    }

    /**
     * Método que retorna a mensagem do membro
     * @param horario
     * @return a mensagem
     */
    @Override
    public String postarMensagem(Horario horario) {

        String msg1 = "Happy Coding!";
        String msg2 = "Happy_C0d1ng. Maskers";
            if (horario == Horario.NORMAL){
                return msg1;
            }
            else{
                return msg2;
            }
    }
}

