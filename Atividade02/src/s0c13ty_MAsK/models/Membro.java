package s0c13ty_MAsK.models;

import s0c13ty_MAsK.enumerates.TiposDeMembro;
import s0c13ty_MAsK.interfaces.Apresentacao;
import s0c13ty_MAsK.interfaces.PostarMensagem;

import java.util.LinkedList;

/**
 * Classe abstrata que representa os membros do grupo
 * com o nome, email e ID do membro
 */

public abstract class Membro implements Apresentacao, PostarMensagem {

    /**
     * atributos dos membros
     */

    private String nome;
    private String email;
    private int ID;
    private TiposDeMembro funcao;

    /**
     * Getter do nome
     * @return String
     * @param nome
     */
    public String getNome(String nome) {
        return this.nome;
    }

    /**
     * Getter do email
     * @return String
     * @param email
     */
    public String getEmail(String email) {
        return this.email;
    }

    /**
     * Getter do ID
     * @return int
     * @param ID
     */
    public int getID(int ID) {
        return this.ID;
    }

    /**
     * Getter do tipos de membro
     * @return o tipo de funcao que o membro executa
     * @param funcao
     */
    public TiposDeMembro getFuncao(TiposDeMembro funcao) {
        return this.funcao;
    }

    /**
     * Setter do nome
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Setter do email
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Setter do ID
     * @param ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * Setter do tipos de membro
     * @param funcao
     */
    public void setFuncao(TiposDeMembro funcao) {
        this.funcao = funcao;
    }

    /**
     * Construtor da classe Membro
     * @param nome
     * @param email
     * @param ID
     * @param funcao
     */
    public Membro(String nome, String email, int ID, TiposDeMembro funcao) {
        this.nome = nome;
        this.email = email;
        this.ID = ID;
        this.funcao = funcao;

    }

    @Override
    public String toString() {
        return "Membro{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", ID=" + ID +
                ", funcao=" + funcao +
                '}';
    }
}
