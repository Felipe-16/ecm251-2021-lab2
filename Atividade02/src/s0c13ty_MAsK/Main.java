// Felipe Ros Pegini R.A: 18.00232-3;
// Daniel Branquinho Gomes R.A: 18.02617-6;
// Juliana Gomes Haroldo R.A: 18.00107-6;

package s0c13ty_MAsK;

import s0c13ty_MAsK.controladores.Sistema;
import s0c13ty_MAsK.enumerates.TiposDeMembro;
import s0c13ty_MAsK.models.MobileMembers;

public class Main {

    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        MobileMembers c1 = new MobileMembers("juliana", "jujugatinha@gmail.com",6969, TiposDeMembro.Mobile_Members);
        ScriptGuys c1 = new ScriptGuys("Felipe", "fefegatinho@gmail.com",1042, TiposDeMembro.Script_Guys);
        HeavyLifters c1 = new HeavyLifters("Daniel", "danigatinho@gmail.com",5678, TiposDeMembro.Heavy_Lifters);
        BigBrothers c1 = new BigBrothers("Daniel", "danigatinho@gmail.com",5578, TiposDeMembro.Big_Brothers);

    }
