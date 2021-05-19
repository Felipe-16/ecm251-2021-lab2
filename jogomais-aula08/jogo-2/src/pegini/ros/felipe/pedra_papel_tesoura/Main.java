package pegini.ros.felipe.pedra_papel_tesoura;

import pegini.ros.felipe.pedra_papel_tesoura.controladores.Sistema;

public class Main {

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        sistema.run();
    }
}
