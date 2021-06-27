package s0c13ty_MAsK.controladores;


import s0c13ty_MAsK.enumerates.TiposDeMembro;
import s0c13ty_MAsK.models.BigBrothers;
import s0c13ty_MAsK.models.Membro;
import s0c13ty_MAsK.models.ScriptGuys;

import java.io.*;
import java.util.*;


public class Arquivamento{

    public static void main(String[] args) {


    //public void PeloAmorFunciona(Membro m) {
           Sistema sys = new Sistema();
//            ScriptGuys sc = new ScriptGuys("Antonio", "toninho@outlook.com", 243, TiposDeMembro.Script_Guys);
//            BigBrothers bg = new BigBrothers("Jacson", "jc@gmail.com", 357, TiposDeMembro.Big_Brothers);


            LinkedList<Membro> meme = new LinkedList<>();

            File csvFile = new File("arquivo_super_Secreto_nao_pode_abrir.csv");

            try {

                PrintWriter out = new PrintWriter(csvFile);


                meme.addLast(());
                meme.add(sys.cadastroMembros().getEmail());
                meme.add(sys.cadastroMembros().getID());
                //meme.add(sys.cadastroMembros().getFuncao()));

//                String a;
//                TiposDeMembro b;
//                int c;

                out.print("Nome");
                out.print(";");
                out.print("ID");
                out.print(";");
                out.println("Função");

//                a = bg.getNome();
//                b = bg.getFuncao();
//                c = bg.getID();


//                for (Membro big : meme) {
//
//                   out.print(());
//                   out.print(";");
//                   out.print();
//                   out.print(";");
//                   out.println(big.getFuncao());
//
                out.flush();
                out.close();
                }



            catch (FileNotFoundException e) {
                e.printStackTrace();
            }


   }



//
//       List<List<String>> rows = Arrays.asList(
//               Arrays.asList("Jean", "author", "Java"),
//               Arrays.asList("David", "editor", "Python"),
//               Arrays.asList("Scott", "editor", "Node.js")
//       );
//
//       FileWriter csvWriter = new FileWriter("new.csv");
//       csvWriter.append("Name");
//       csvWriter.append(",");
//       csvWriter.append("Role");
//       csvWriter.append(",");
//       csvWriter.append("Topic");
//       csvWriter.append("\n");
//
//       for (List<String> rowData : rows) {
//           csvWriter.append(String.join("", rowData));
//           csvWriter.append("\n");
//       }
//
//       csvWriter.flush();
//       csvWriter.close();
//
















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