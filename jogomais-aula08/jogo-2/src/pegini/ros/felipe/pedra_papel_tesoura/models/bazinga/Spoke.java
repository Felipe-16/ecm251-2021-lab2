package pegini.ros.felipe.pedra_papel_tesoura.models.bazinga;

import pegini.ros.felipe.pedra_papel_tesoura.models.Jogada;
import pegini.ros.felipe.pedra_papel_tesoura.models.classico.Papel;
import pegini.ros.felipe.pedra_papel_tesoura.models.classico.Pedra;
import pegini.ros.felipe.pedra_papel_tesoura.models.classico.Tesoura;

public class Spoke extends Jogada {

    @Override
    public Jogada[] jogadasQueGanho() {
        return new Jogada[]{new Tesoura(), new Pedra()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[]{new Papel(),new Lagarto()};
    }

    @Override
    public String toString() {
        return "Spoke";
    }
}
