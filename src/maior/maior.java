package maior;

import javax.swing.JOptionPane;

public class maior {
    public static void main(String[] args){
       int n1 = 0;
       int n2 =0;
       int n3 = 0;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1° numero:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite 2° numero:"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite 3° numero:"));
        
        if(n1 >= n2 && n1 >= n3){
            JOptionPane.showMessageDialog(null, "O numero maior digitado foi " +n1);
        }else if(n2 >= n1 && n2 >= n3){
            JOptionPane.showMessageDialog(null, "O maior numero digitado foi " +n2);
        }else{
            JOptionPane.showMessageDialog(null, "O maior numero digitado foi " +n3);
        }

    }

}
