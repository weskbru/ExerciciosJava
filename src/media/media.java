package média;

import javax.swing.JOptionPane;

public class média {
    public static void main(String[] args){
        // Declare as variaveis 
        int nota1 = 0;
        int nota2 = 0;
        int media = 0;
        
        // faça a converção das variaveis
        
        nota1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua primeira nota:"));
        nota2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua segunda nota:"));
        
        // faça a operação soma , e depois divida para obiter a média das notas
        media = (nota1 + nota2) / 2;
        
        // Escreva a mensagem na tela com a média para o usuario 
        JOptionPane.showMessageDialog(null, "Sua  média de nota é: " +média);
      
        
    }
}
