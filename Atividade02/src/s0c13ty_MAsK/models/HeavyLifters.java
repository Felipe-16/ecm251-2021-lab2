package s0c13ty_MAsK.models;

import s0c13ty_MAsK.enumerates.Horario;
import s0c13ty_MAsK.enumerates.TiposDeMembro;

/**
 * Classe de membros que trabalham com estações pesadas
 */
public class HeavyLifters extends Membro {

    /**
     * Construtor da classe Heavy Lifters
     * @param nome - nome do membro
     * @param email - email do membro
     * @param ID - ID do membro
     * @param funcao - função do membro
     */
    public HeavyLifters(String nome, String email, int ID, TiposDeMembro funcao) {

        super(nome, email, ID, funcao);
    }

    /**
     * Método que vai exibir a apresentação do membro
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

        String msg1 = "Podem contar conosco!";
        String msg2 = "N00b_qu3_n_Se_r3pita.bat";
            if (horarioAtual == Horario.NORMAL){
                System.out.println(msg1);
            }
            else{
                System.out.println(msg2);
            }
    }
}
