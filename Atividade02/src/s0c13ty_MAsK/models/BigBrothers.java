package s0c13ty_MAsK.models;


/**
 * Classe dos Big brothers que são os responsaveis
 */
public class BigBrothers extends Membro{


    /**
     * Metodo que cadastra os membros com o seu papel dentro do grupo
     */
    // Quando cadastrados, os script guys devem mandar uma mensagem de boas vindas
    final void cadastroMembros () {

    }

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

    @Override
    public String apresentacao() {

        return null;
    }
}
