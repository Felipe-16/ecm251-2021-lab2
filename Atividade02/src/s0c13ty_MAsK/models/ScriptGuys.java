package s0c13ty_MAsK.models;

import s0c13ty_MAsK.enumerates.Horario;

/**
 * Classe que trabalham com os notebooks
 */

public class ScriptGuys extends Membro{
    @Override
    public String apresentacao() {

        return null;
    }

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
