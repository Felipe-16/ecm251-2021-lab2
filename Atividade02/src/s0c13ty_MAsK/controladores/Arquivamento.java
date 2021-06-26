package s0c13ty_MAsK.controladores;


import s0c13ty_MAsK.models.BigBrothers;
import s0c13ty_MAsK.models.Membro;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;



public class Arquivamento {


    public static void main(String[] args) {


        public static void CSV(ArrayList<Membro>  ()){

            {
                Writer writer = null;
                try {
                    writer = Files.newBufferedWriter(Paths.get("arquivo_super_Secreto_nao_pode_abrir.csv"));
                } catch (IOException e) {
                    e.printStackTrace();
                }

                try {
                    writer.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}