package idadeVota;

import javax.swing.JOptionPane;

public class idadeVota {
    public static void main(String[] args){
        // se uma pessoa tem 16 anos ela já poderá vota
        int anoNascimento = 0;
        int anoAtual = 0;
        int idade = 0;

        anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual:"));
        anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Qual ano do seu nascimento:"));
        
        idade = anoAtual - anoNascimento;

        if(idade >= 16){
            JOptionPane.showMessageDialog(null, "você pode votar:");
        }else{
            JOptionPane.showMessageDialog(null, "você nao poderá votar", "Alerta", 0);
        }

    }
}
