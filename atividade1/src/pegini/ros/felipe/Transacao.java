// Felipe Ros Pegini R.A: 18.00232-3;
// Daniel Branquinho Gomes R.A: 18.02617-6;

package pegini.ros.felipe;
import java.util.Random;
import pegini.ros.felipe.Usuarios;
import pegini.ros.felipe.Conta;

// Criando uma classe de transação entre contas
public class Transacao {
    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    // Gerando a função Qr
    public String gerarQR(Usuarios account, double value){

        int transactionNumber = getRandomNumberInRange(1000,9999);
        return account.getIdConta() + "; " + account.getNome() + "; " + value + "; " + transactionNumber;
    }

    // Criando uma função para efetuar transferencia
    public void transferencia( Usuarios origem,Usuarios destino, String Qr){
        // Auxilio do Pedro Dominichelli Fabris para a criação da string array
        String[] array = new String[4];
        array = Qr.split(";");
        double valor =  Double.parseDouble(array[2]);

        if(verificaSaldo(origem,valor)){
            destino.setSaldo(valor + destino.getSaldo());
            origem.setSaldo(origem.getSaldo() - valor);
        }
    }

    // Verificador de saldo para transferencia
    private boolean verificaSaldo(Usuarios conta, double valor){
        if (conta.getSaldo() >= valor){
            return true;
        }
        else {
            return false;
        }
    }
}
