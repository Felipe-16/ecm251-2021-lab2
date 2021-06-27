package s0c13ty_MAsK.models;

import s0c13ty_MAsK.enumerates.Horario;
import s0c13ty_MAsK.enumerates.TiposDeMembro;

/**
 * Classe dos membros responsáveis pela adição ou remoção de membros
 */
public class BigBrothers extends Membro{

    /**
     * Construtor da classe Big Brothers
     * @param nome - nome do membro
     * @param email - email do membro
     * @param ID - ID do membro
     * @param funcao - função do membro
     */
    public BigBrothers(String nome, String email, int ID, TiposDeMembro funcao) {

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
     * @param horarioAtual - horário atual do membro (NORMAL ou EXTRA)
     */
    @Override
    public void postarMensagem(Horario horarioAtual) {

        String msg1 = "Sempre ajudando as pessoas membros ou não S2!";
        String msg2 = "...";
            if (horarioAtual == Horario.NORMAL){
                System.out.println(msg1);
            }
            else{
                System.out.println(msg2);
            }
    }
}
