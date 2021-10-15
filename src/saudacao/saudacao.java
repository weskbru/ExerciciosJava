package saudacao;

import javax.swing.JOptionPane;

public class saudacao {
    public static void main(String[] args){
        
       String name;
        name = JOptionPane.showInputDialog("Digite seu nome?");
        JOptionPane.showMessageDialog(null, "Ola " + name + " seja bem vindo ao curso java !");
         

    }
}
