package pegini.ros.felipe.pedra_papel_tesoura.models.classico;

import pegini.ros.felipe.pedra_papel_tesoura.models.Jogada;
import pegini.ros.felipe.pedra_papel_tesoura.models.bazinga.Lagarto;
import pegini.ros.felipe.pedra_papel_tesoura.models.bazinga.Spoke;

public class Pedra extends Jogada {

    @Override
    public Jogada[] jogadasQueGanho() {
        return new Jogada[]{new Tesoura(), new Lagarto()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[]{new Papel(),new Spoke()};
    }

    @Override
    public String toString() {
        return "Pedra";
    }

}
