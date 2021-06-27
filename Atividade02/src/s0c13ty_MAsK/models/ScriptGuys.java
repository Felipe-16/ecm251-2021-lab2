package s0c13ty_MAsK.models;

import s0c13ty_MAsK.enumerates.Horario;
import s0c13ty_MAsK.enumerates.TiposDeMembro;

/**
 * Classe dos membros que trabalham com os notebooks
 */
public class ScriptGuys extends Membro {

    /**
     * Construtor da classe Script Guys
     * @param nome - nome do membro
     * @param email - email do membro
     * @param ID - ID do membro
     * @param funcao - função do membro
     */
    public ScriptGuys(String nome, String email, int ID, TiposDeMembro funcao) {

        super(nome, email, ID, funcao);
    }

    /**
     * Método que vai exibir a apresentção do membro
     */
    @Override
    public void apresentacao() {

        System.out.println(toString());
    }

    /**
     * Método que exibe a mensagem do membro
     * @param horarioAtual - horário do membro (NORMAL ou EXTRA)
     */
    @Override
    public void postarMensagem(Horario horarioAtual) {

        String msg1 = "Prazer em ajudar novos amigos de código!";
        String msg2 = "QU3Ro_S3us_r3curs0s.py";
            if (horarioAtual == Horario.NORMAL){
                System.out.println(msg1);
            }
            else{
                System.out.println(msg2);
            }
    }
}
