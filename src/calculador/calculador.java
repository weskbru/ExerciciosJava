package calculador;

import javax.swing.JOptionPane;

public class calculador {
    public static void main(String[] args){
        int adicao , subitracao ,multiplicacao , divisao , n1 , n2;
        String number1 , number2;

        number1 = JOptionPane.showInputDialog("Digite um numero");
        number2 = JOptionPane.showInputDialog("Digite outro numero");
        n1 =Integer.parseInt(number1);
        n2 =Integer.parseInt(number2);

        adicao = n1 + n2;
        subitracao = n1 - n2;
        multiplicacao = n1 * n2;
        divisao = n1 / n2;
        
        JOptionPane.showMessageDialog(null,
        "resultados" + "\n1 - adiçao = " +ad+ "\n2 -subtração = " +sub+ "\n3- multiplicação = "+mult+ "\n4- divisão = "+div);
    }
}
