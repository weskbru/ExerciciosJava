package valorJanta;

import javax.swing.JOptionPane;

public class valorJanta {
    public static void main(String[] args){
        double valorJanta = 0;
        double valorfinal = 0;
        double acrecimo = 1.10;

        valorJanta = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor do jantar:"));
        valorfinal = valorJanta * acrecimo;

        // string.format(%.2f) formata a quantidade de casas decimais 
        JOptionPane.showMessageDialog(null, "Valor total com 10% do garçom e de:\n "+ String.format("%.2f",valorfinal) +" R$");
        
    }
}
