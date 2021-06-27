package s0c13ty_MAsK;

import s0c13ty_MAsK.controladores.Sistema;
import java.io.IOException;

/**
 * @author Felipe Ros Pegini R.A: 18.00232-3;
 * @author Daniel Branquinho Gomes R.A: 18.02617-6;
 * @author Juliana Gomes Haroldo R.A: 18.00107-6;
 */

/**
 * Classe Main responsavel por rodar o Sistema
 */
public class Main {

    /**
     * Método que executa o sistema
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        Sistema sistema = new Sistema();
        sistema.run();
    }
}