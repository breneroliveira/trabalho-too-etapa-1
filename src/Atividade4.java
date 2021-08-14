
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
public class Atividade4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaScanner = new Scanner(System.in);
        
        float valorCompra = 0;
        int totalParcelas = 0;
        
        Calendar dataAtual = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            System.out.print("Valor da compra (R$): ");
            valorCompra = entradaScanner.nextFloat();
            
            System.out.print("Total de parcelas: ");
            totalParcelas = entradaScanner.nextInt();
            
            float valorParcela[] = new float[totalParcelas];
            Calendar dataVencimento[] = new Calendar[totalParcelas];
            
            for(int i = 0; i < valorParcela.length; i++) {
                valorParcela[i] = (valorCompra / totalParcelas);
                
                dataAtual.add(Calendar.DAY_OF_MONTH, 30);
                System.out.print("Valor da parcela (R$): " + valorParcela[i]);
                System.out.println("\tData do " + (i + 1) + "º vencimento: " + sdf.format(dataAtual.getTime())); 
            }
            System.out.println("");
        } catch(Exception e) {
           System.out.println("\nErro: " + e.getMessage() +
                              "\nClasse do Erro: " + e.getClass() + "\n");
       }
    }
}