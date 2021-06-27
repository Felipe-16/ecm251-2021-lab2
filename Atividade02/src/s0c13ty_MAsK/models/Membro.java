package s0c13ty_MAsK.models;

import s0c13ty_MAsK.enumerates.TiposDeMembro;
import s0c13ty_MAsK.interfaces.Apresentacao;
import s0c13ty_MAsK.interfaces.PostarMensagem;

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
     */
    public String getNome() {

        return nome;
    }

    /**
     * Getter do email
     * @return String
     */
    public String getEmail() {

        return email;
    }

    /**
     * Getter do ID
     * @return int
     */
    public int getID() {

        return ID;
    }

    /**
     * Getter do tipos de membro
     * @return o tipo de funcao que o membro executa
     */
    public TiposDeMembro getFuncao() {

        return funcao;
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

    /**
     * Método que retorna o toString do membro, independente da função
     * @return to string
     */
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
