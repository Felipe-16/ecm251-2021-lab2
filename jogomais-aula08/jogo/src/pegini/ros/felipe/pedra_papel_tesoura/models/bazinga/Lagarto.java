package pegini.ros.felipe.pedra_papel_tesoura.models.bazinga;

import pegini.ros.felipe.pedra_papel_tesoura.models.Jogada;
import pegini.ros.felipe.pedra_papel_tesoura.models.classico.Papel;
import pegini.ros.felipe.pedra_papel_tesoura.models.classico.Pedra;
import pegini.ros.felipe.pedra_papel_tesoura.models.classico.Tesoura;

public class Lagarto extends Jogada {
    @Override
    public boolean verificaSeGanhei(Jogada jogada) {
        return (jogada instanceof Papel) || (jogada instanceof Spoke);
    }

    @Override
    public boolean verificaSePerdi(Jogada jogada) {
        return (jogada instanceof Tesoura) || (jogada instanceof Pedra);    }

    @Override
    public String toString() {
        return "Lagarto";
    }
}
