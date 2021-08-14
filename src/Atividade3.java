
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brene
 */
public class Atividade3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dataScanner = new Scanner(System.in);
        String dataString = null;
        
        System.out.print("Informe uma (dd/MM/yyyy): ");
        dataString = dataScanner.nextLine();
        
        Calendar dataInformada = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            sdf.setLenient(false);
            
            dataInformada.setTime(sdf.parse(dataString));
            System.out.println("\nData inserida: " + sdf.format(dataInformada.getTime()));
            
            for(int i = 0; i < 5; i++) {
                dataInformada.add(Calendar.DAY_OF_MONTH, 7);
                System.out.println("Data de pagamento: " + sdf.format(dataInformada.getTime()));
            }
            System.out.println("");
        } catch(Exception e) {
           System.out.println("\nErro: " + e.getMessage() +
                              "\nClasse do Erro: " + e.getClass() + "\n");
       }
    }
}