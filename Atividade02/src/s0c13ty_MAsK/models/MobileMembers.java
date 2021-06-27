package s0c13ty_MAsK.models;

import s0c13ty_MAsK.enumerates.Horario;
import s0c13ty_MAsK.enumerates.TiposDeMembro;

/**
 * Classe dos membros que utilizam o celular
 */
public class MobileMembers extends Membro{

    /**
     * Construtor da classe Mobile Members
     * @param nome - nome do membro
     * @param email - email do membro
     * @param ID - ID do membro
     * @param funcao - função do membro
     */
    public MobileMembers(String nome, String email, int ID, TiposDeMembro funcao) {

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

        String msg1 = "Happy Coding!";
        String msg2 = "Happy_C0d1ng. Maskers";
            if (horarioAtual == Horario.NORMAL){
                System.out.println(msg1);
            }
            else{
                System.out.println(msg2);
            }
    }
}

