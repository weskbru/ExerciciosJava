package salario;

import javax.swing.JOptionPane;

public class salario {
    public static void main(String[] args){
        String nome = "";
        int horaTrabalhada, diasDaSemana, valoHora;
        int soma;

        nome = JOptionPane.showInputDialog("Digite seu nome:");
        horaTrabalhada = Integer.parseInt(JOptionPane.showInputDialog("Quantas horas voce trabalha no dia:"));
        diasDaSemana = Integer.parseInt(JOptionPane.showInputDialog("Quantos dias na semana:"));
        valoHora = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor da sua hora:"));

        soma = horaTrabalhada * valoHora * diasDaSemana * 4; // 4 corresponde a quantidade de semana no més 
        JOptionPane.showMessageDialog(null, nome + " O valor do seu salário corresponde a \n"  +soma+ " R$");

        
     


    }
}
