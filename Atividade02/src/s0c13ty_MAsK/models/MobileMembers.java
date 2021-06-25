package s0c13ty_MAsK.models;

import s0c13ty_MAsK.enumerates.Horario;

/**
 * Classe dos membros que utilizam o celular
 */
public class MobileMembers extends Membro{
    Horario n = Horario.NORMAL;
    Horario e = Horario.EXTRA;

    @Override
    public String apresentacao() {

        return null;
    }

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

