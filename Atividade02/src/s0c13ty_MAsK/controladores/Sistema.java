package s0c13ty_MAsK.controladores;

import s0c13ty_MAsK.enumerates.Horario;
import s0c13ty_MAsK.enumerates.TiposDeMembro;
import s0c13ty_MAsK.models.BigBrothers;
import s0c13ty_MAsK.models.HeavyLifters;
import s0c13ty_MAsK.models.MobileMembers;
import s0c13ty_MAsK.models.ScriptGuys;

/**
 * Classe onde sera executado a implementacao
 */
public class Sistema {
    public static void main(String[] args) {
        MobileMembers c1 = new MobileMembers("juliana", "jujugatinha@gmail.com",6969, TiposDeMembro.Mobile_Members);
        ScriptGuys c2 = new ScriptGuys("Felipe", "fefegatinho@gmail.com",1042, TiposDeMembro.Script_Guys);
        HeavyLifters c3 = new HeavyLifters("Daniel", "danigatinho@gmail.com",5678, TiposDeMembro.Heavy_Lifters);
        BigBrothers c4 = new BigBrothers("Daniel", "danigatinho@gmail.com",5578, TiposDeMembro.Big_Brothers);

        c1.apresentacao();
        c1.postarMensagem(Horario.EXTRA);
        c2.apresentacao();
        c2.postarMensagem(Horario.EXTRA);
        c3.apresentacao();
        c3.postarMensagem(Horario.EXTRA);
        c4.apresentacao();
        c4.postarMensagem(Horario.EXTRA);

        c4.cadastroMembros();
    }
    // registrar membros
    // informar quando perguntado o horario
    // postar msg para todos os membros
    // chamada de relatorio -> apresentacao

}
