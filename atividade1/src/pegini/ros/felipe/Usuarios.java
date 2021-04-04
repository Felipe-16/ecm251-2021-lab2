// Felipe Ros Pegini R.A: 18.00232-3;
// Daniel Branquinho Gomes R.A: 18.02617-6;

package pegini.ros.felipe;


// Criando a classe usuarios herdando da classe mae Conta
// Pedro Dominichelli Fabris me explicou o porque de precisar herdar da classe conta
public class Usuarios extends Conta {
    // Atributos do usuarios
    private String nome;
    private String senha;
    private String email;


    //  Fazendo um get para pegar cada atributo
    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public String getEmail() {
        return email;
    }

    // Fazendo um set para trocar cada atributo
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Função que cria um novo usuario com o requerimento de seus atributos
    public void novoUsuario(String nome, String senha,String email, int idConta, double saldo) {
        this.setNome(nome);
        this.setEmail(email);
        this.setSenha(senha);
        this.setIdConta(idConta);
        this.setSaldo(saldo);
    }

    // Função que retorna os valores da classe em String
    @Override
    public String toString() {
        return "Usuarios{" +
                "nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
