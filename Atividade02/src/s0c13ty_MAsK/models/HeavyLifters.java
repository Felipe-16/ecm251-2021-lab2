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

        String msg1 = "Podem contar conosco!";
        String msg2 = "N00b_qu3_n_Se_r3pita.bat";
            if (horario == Horario.NORMAL){
                System.out.println(msg1);
            }
            else{
                System.out.println(msg2);
            }
    }
}
