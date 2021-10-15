package calculador;

import javax.swing.JOptionPane;

public class calculador {
    public static void main(String[] args){
        int ad , sub ,mult , div , n1 , n2;
        String number1 , number2;

        number1 = JOptionPane.showInputDialog("Digite um numero");
        number2 = JOptionPane.showInputDialog("Digite outro numero");
        n1 =Integer.parseInt(number1);
        n2 =Integer.parseInt(number2);

        ad = n1 + n2;
        sub = n1 - n2;
        mult = n1 * n2;
        div = n1 / n2;
        
        JOptionPane.showMessageDialog(null,
        "resultados" + "\n1 - adiçao = " +ad+ "\n2 -subtração = " +sub+ "\n3- multiplicação = "+mult+ "\n4- divisão = "+div);
    }
}
