package sucessor;

import javax.swing.JOptionPane;

public class sucessor {
    public static void main(String[] args){
        // desclare variaveis
        String entrada = "";
        int antecessor = 0;
        int number = 0;
        int sucessor = 0;
        
        //faça a converçao de String para int
        entrada = JOptionPane.showInputDialog("Digite um numero:");
        
        number = Integer.parseInt(entrada); 

        sucessor = number + 1;  // soma 1 de number
        antecessor = number - 1; //tira 1 de number

        // Mostre o resultado na tela
        JOptionPane.showMessageDialog(null, "voce digitou " +number + 
        "\n seu antecessor é " +antecessor+ "\n seu sucessor é " +sucessor);

    }
    
}
