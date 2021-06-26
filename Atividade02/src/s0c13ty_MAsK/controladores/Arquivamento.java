package s0c13ty_MAsK.controladores;


import s0c13ty_MAsK.enumerates.TiposDeMembro;
import s0c13ty_MAsK.models.BigBrothers;
import s0c13ty_MAsK.models.Membro;
import s0c13ty_MAsK.models.ScriptGuys;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;


public class Arquivamento {



    public static void main(String[] args) throws FileNotFoundException {

        BigBrothers sc = new BigBrothers( "Antonio", "toninho@outlook.com", 243, TiposDeMembro.Big_Brothers);
        BigBrothers bg = new BigBrothers("Yasmim","yaya@hotmail.com", 345, TiposDeMembro.Big_Brothers);

      LinkedList<BigBrothers> meme = new LinkedList<>();
        File csvFile = new File("arquivo_super_Secreto_nao_pode_abrir.csv");
        try {
            PrintWriter out = new PrintWriter(csvFile);
                meme.add(bg);
                meme.add(sc);

             for(BigBrothers big : meme){

             out.print(bg.getNome());
             out.print(";");
             out.print(bg.getID());
             out.print(";");
             out.print(bg.getFuncao());
             out.println(" ");


             }

             out.close();



        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}














/*       MobileMembers mobi = new MobileMembers();
        System.out.println();
        LinkedList<BigBrothers> bb = new LinkedList<BigBrothers>();


            LinkedList<String> mm = new LinkedList<String>();
            mm.addLast(MobileMembers.class.getName());

            mm.add(mobi.getNome());
            mm.add(mobi.getEmail());


            System.out.println(mm);


                System.out.println();
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
 */