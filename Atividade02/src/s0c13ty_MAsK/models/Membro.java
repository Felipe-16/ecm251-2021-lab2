package s0c13ty_MAsK.models;

import s0c13ty_MAsK.interfaces.Apresentacao;
import s0c13ty_MAsK.interfaces.PostarMensagem;

/**
 * Classe abstrata que representa os membros do grupo
 * com o nome, email e ID do membro
 */
public abstract class Membro implements Apresentacao, PostarMensagem {
    private String nome;
    private String email;
    private int ID;

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getID() {
        return ID;
    }
}
