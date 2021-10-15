package valorConta;

import javax.swing.JOptionPane;

public class conta {
    public static void main(String[] args) {
        int soma;
        int valorDaConta = 0;
        int numeroDePessoas = 0;

        valorDaConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da conta:"));
        numeroDePessoas = Integer.parseInt(JOptionPane.showInputDialog("Quantas pessoas irá pagar:"));

        soma = valorDaConta / numeroDePessoas;
        JOptionPane.showMessageDialog(null, "O valor que cada pessoa irá pagar é " + soma + " R$");
    }
}
