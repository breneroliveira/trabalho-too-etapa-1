
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brene
 */
public class Atividade2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String diariaString = JOptionPane.showInputDialog("Valor da diária (R$): ");
            float diariaFloat = Float.parseFloat(diariaString);
            
            String dataStringL = JOptionPane.showInputDialog("Data de locação (dd/MM/yyyy): ");
            Calendar dataLocacao = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            dataLocacao.setTime(sdf.parse(dataStringL));
            
            String dataStringD = JOptionPane.showInputDialog("Data de devolução (dd/MM/yyy): ");
            Calendar dataDevolucao = Calendar.getInstance();
            dataDevolucao.setTime(sdf.parse(dataStringD));
            
            long miliSegundosPorDia = 24 * 60 * 60 * 1000;
            long diferenca = dataDevolucao.getTimeInMillis() - dataLocacao.getTimeInMillis();
            long diasDiferenca = diferenca / miliSegundosPorDia;
            
            JOptionPane.showMessageDialog(null, "Valor da diária (R$): " + diariaFloat + "\n" +
                                                "Data de locação: " + sdf.format(dataLocacao.getTime()) + "\n" +
                                                "Data de devolução: " + sdf.format(dataDevolucao.getTime()) + "\n" +
                                                "Dias de locação: " + diasDiferenca + "\n" +
                                                "Valor total da locação (R$): " + (diariaFloat*diasDiferenca) + "\n");
        } catch(Exception e) {
           JOptionPane.showMessageDialog(null, "\nErro: " + e.getMessage() +
                              "\nClasse do Erro: " + e.getClass() + "\n");
       }
    }   
}