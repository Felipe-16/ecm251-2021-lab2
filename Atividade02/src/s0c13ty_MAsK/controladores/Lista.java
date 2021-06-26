package s0c13ty_MAsK.controladores;

import s0c13ty_MAsK.models.Membro;
import java.util.ArrayList;

/**
 * Classe que devolve a lista dos membros
 */
public class Lista {
    private ArrayList<Membro> listaMembro = new ArrayList<Membro>();

    /**
     * Método que devolve a lista de membros
     * @return lista de membros
     */
    public ArrayList<Membro> getMembro() {
        return listaMembro;
    }

}


