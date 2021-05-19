package pegini.ros.felipe.pedra_papel_tesoura.models.bazinga;

import pegini.ros.felipe.pedra_papel_tesoura.models.Jogada;
import pegini.ros.felipe.pedra_papel_tesoura.models.classico.Papel;
import pegini.ros.felipe.pedra_papel_tesoura.models.classico.Pedra;
import pegini.ros.felipe.pedra_papel_tesoura.models.classico.Tesoura;

public class Lagarto extends Jogada {

    @Override
    public Jogada[] jogadasQueGanho() {
        return new Jogada[]{new Spoke(), new Papel()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[]{new Pedra(),new Tesoura()};
    }

    @Override
    public String toString() {
        return "Lagarto";
    }
}
