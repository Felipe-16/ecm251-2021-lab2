package s0c13ty_MAsK.controladores;

import s0c13ty_MAsK.models.Membro;
import java.io.*;
import java.util.ArrayList;

/**
 * Classe de arquivamento dos membros em um arquivo .csv
 */
public class Arquivamento {

    /**
     * Método que realiza o arquivamento dos novos membros em um arquivo .csv
     * @param list - lista dos membros cadastrados
     * @throws FileNotFoundException - Exceção para arquivos não encontrados
     */
    public void arquivar(ArrayList<Membro> list) throws FileNotFoundException {

        Lista lista = new Lista();

        File csvFile = new File("arquivo_super_Secreto_nao_pode_abrir.csv"); //Cria o arquivo .csv

        /**
         * Realiza a criação do cabeçalho com o nome, ID e função e adiciona de cada membro
         * o nome, ID e a função separados por ";"
         */
        try {
            PrintWriter out = null;

            out = new PrintWriter(csvFile);

            out.print("Nome");
            out.print(";");
            out.print("ID");
            out.print(";");
            out.println("Funcao");

            PrintWriter finalOut = out;
            list.forEach(membro -> {

                finalOut.print(membro.getNome());
                finalOut.print(";");
                finalOut.print(membro.getID());
                finalOut.print(";");
                finalOut.println(membro.getFuncao());

            });

            out.close();

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
   }
}






















