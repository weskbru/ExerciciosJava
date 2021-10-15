package senha;

import javax.swing.JOptionPane;

public class senha {
    public static void main(String[] args){
        int senhaDeEntrada = 0;
        int senha = 1234;
        
        senhaDeEntrada = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a senha de 4 digitos:","login",1)); 
        
        if(senha == senhaDeEntrada){
            JOptionPane.showMessageDialog(null, "Acesso permitido");
        }else{
            JOptionPane.showMessageDialog(null, "Acesso negado", "Acesso:", 0);
        }
    }
}
