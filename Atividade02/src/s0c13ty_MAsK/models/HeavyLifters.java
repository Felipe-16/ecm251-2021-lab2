package s0c13ty_MAsK.models;

import s0c13ty_MAsK.enumerates.Horario;
import s0c13ty_MAsK.enumerates.TiposDeMembro;

/**
 * Classe que trabalham com estacoes pesadas
 */

public class HeavyLifters extends Membro {

    /**
     * Construtor da classe Heavy Lifters
     *
     * @param nome
     * @param email
     * @param ID
     * @param funcao
     */
    public HeavyLifters(String nome, String email, int ID, TiposDeMembro funcao) {
        super(nome, email, ID, funcao);
    }

    /**
     * Método que retorna a mensagem do membro
     * @param horario
     * @return a mensagem
     */
    @Override
    public String postarMensagem(Horario horario) {

        String msg1 = "Podem contar conosco!";
        String msg2 = "N00b_qu3_n_Se_r3pita.bat";
        if (horario == Horario.NORMAL){
            return msg1;
        }
        else{
            return msg2;
        }
    }

    /**
     * Método que vai retornar a apresentção do membro
     * @return Apresentação
     */
    @Override
    public String apresentacao() {

        return null;
    }
}
