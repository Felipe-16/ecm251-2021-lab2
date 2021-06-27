package s0c13ty_MAsK.interfaces;

import s0c13ty_MAsK.enumerates.Horario;

/**
 * Interface que os membros postam as suas mensagens
 */

public interface PostarMensagem {

    /**
     * Método que permite o usuario implementar a mensagem dele em determinado horario
     * @param horario
     */
    public void postarMensagem(Horario horario);
}
