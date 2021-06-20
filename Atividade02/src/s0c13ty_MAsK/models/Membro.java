package s0c13ty_MAsK.models;

import s0c13ty_MAsK.interfaces.Apresentacao;
import s0c13ty_MAsK.interfaces.PostarMensagem;

/**
 * Classe abstrata que representa os membros do grupo
 * com o nome, email e ID do membro
 */
public abstract class Membro implements Apresentacao, PostarMensagem {
    String nome;
    String email;
    int ID;


}
