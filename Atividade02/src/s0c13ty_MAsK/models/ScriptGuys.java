package s0c13ty_MAsK.models;

import s0c13ty_MAsK.enumerates.Horario;
import s0c13ty_MAsK.enumerates.TiposDeMembro;

/**
 * Classe que trabalham com os notebooks
 */

public class ScriptGuys extends Membro{
    /**
     * Construtor da classe Script Guys
     *
     * @param nome
     * @param email
     * @param ID
     * @param funcao
     */
    public ScriptGuys(String nome, String email, int ID, TiposDeMembro funcao) {
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
    public String postarMensagem(Horario horario) {

        String msg1 = "Prazer em ajudar novos amigos de código!";
        String msg2 = "QU3Ro_S3us_r3curs0s.py";
        if (horario == Horario.NORMAL){
            return msg1;
        }
        else{
            return msg2;
        }
    }
}
