package s0c13ty_MAsK.models;

import s0c13ty_MAsK.enumerates.TiposDeMembro;
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
    private TiposDeMembro funcao;

    /**
     * Método Getter do nome do membro
     * @return String - nome do membro
     */
    public String getNome() {

        return nome;
    }

    /**
     * Método Getter do email do membro
     * @return String - email do membro
     */
    public String getEmail() {

        return email;
    }

    /**
     * Método Getter do ID do membro
     * @return int - número do ID
     */
    public int getID() {

        return ID;
    }

    /**
     * Método Getter do tipos de membro
     * @return String - tipo de função que o membro executa
     */
    public TiposDeMembro getFuncao() {

        return funcao;
    }

    /**
     * Método Setter do nome do membro
     * @param nome - nome do membro
     */
    public void setNome(String nome) {

        this.nome = nome;
    }

    /**
     * Método Setter do email do membro
     * @param email - email do membro
     */
    public void setEmail(String email) {

        this.email = email;
    }

    /**
     * Método Setter do ID do membro
     * @param ID - ID do membro
     */
    public void setID(int ID) {

        this.ID = ID;
    }

    /**
     * Método Setter do tipos de membro do membro
     * @param funcao - função do membro
     */
    public void setFuncao(TiposDeMembro funcao) {

        this.funcao = funcao;
    }

    /**
     * Construtor da classe Membro
     * @param nome - nome do membro
     * @param email - email do membro
     * @param ID - ID do membro
     * @param funcao - função do membro
     */
    public Membro(String nome, String email, int ID, TiposDeMembro funcao) {

        this.nome = nome;
        this.email = email;
        this.ID = ID;
        this.funcao = funcao;
    }

    /**
     * Método que retorna o toString do membro, independente da função
     * @return toString - lista com informações do membro
     */
    @Override
    public String toString() {

        return "Membro {" +
                "nome ='" + nome + '\'' +
                ", email ='" + email + '\'' +
                ", ID =" + ID +
                ", funcao =" + funcao +
                '}';
    }
}
