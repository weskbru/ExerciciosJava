package senha;

// importando pacote que interage com usuario
import javax.swing.JOptionPane;

public class senha {
    public static void main(String[] args){
        // desclare as variaveis 
        int senhaDeEntrada = 0;
        int senha = 1234; // opicional
        
        // mostra uma caixa de entrada de dados iteragindo  com usuario 
        senhaDeEntrada = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a senha de 4 digitos:","login",1)); 
        
        // metodo de comparçao de entrada de dados 
        if(senha == senhaDeEntrada){
            JOptionPane.showMessageDialog(null, "Acesso permitido");
        }else{
            JOptionPane.showMessageDialog(null, "Acesso negado", "Acesso:", 0);
        }
    }
}
