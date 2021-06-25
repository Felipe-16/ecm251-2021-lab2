package s0c13ty_MAsK.models;


/**
 * Classe que trabalham com estacoes pesadas
 */
public class HeavyLifters extends Membro {

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

    @Override
    public String apresentacao() {

        return null;
    }
}
