
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
public class Atividade1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome = null;
        float salario = 0;
        float aliquota = 0;
        float salarioLiquido = 0;
        
       try {    
            System.out.print("Nome: ");
            nome = entrada.nextLine();

            System.out.print("Salário (R$): ");
            salario = entrada.nextFloat();
            
            while(salario < 1) {
                System.out.print("O salário não pode ser negativo (R$): ");
                salario = entrada.nextFloat();
            }
            
            System.out.println("");
            
            if(salario <= 1100) {
                aliquota = (float) ((salario * 7.5) / 100);
                salarioLiquido = salario - aliquota;
            } else if(salario >= 1100.01 && salario <= 2203.48) {
                aliquota = (float) ((salario * 9) / 100);
                salarioLiquido = salario - aliquota;
            } else if(salario >= 2203.49 && salario <= 3305.22) {
                aliquota = (float) ((salario * 12) / 100);
                salarioLiquido = salario - aliquota;
            } else if(salario >= 3305.23) {
                aliquota = (float) ((salario * 14) / 100);
                salarioLiquido = salario - aliquota;
            }

            System.out.println("Nome: " + nome);
            System.out.println("Salário bruto (R$): " + salario);
            System.out.println("INSS: " + aliquota);
            System.out.println("Salário líquido (R$): " + salarioLiquido + "\n");
        
       } catch(Exception e) {
           System.out.println("\nErro: " + e.getMessage() +
                              "\nClasse do Erro: " + e.getClass() + "\n");
       }
    }
}