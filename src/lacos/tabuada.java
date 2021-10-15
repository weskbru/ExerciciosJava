package lacos;

import javax.swing.JOptionPane;

public class tabuada {
    public static void main(String[] args) {
        // chamando o metodo calcula
        calcula();
    }



    public static void calcula(){   
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numereo:"));
        for(int i = 0; i <= 10; i++){
            System.out.println(numero+ " x " +i+ " = " +(numero * i));
        }
    }

}

