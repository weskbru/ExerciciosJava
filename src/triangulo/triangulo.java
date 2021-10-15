package triangulo;

import javax.swing.JOptionPane;


public class triangulo {
    public static void main(String[] args){

        int lado1, lado2, lado3;
     
        lado1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um lado de triangulo:"));
        lado2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro lado de triangulo:"));
        lado3 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro lado de triangulo:"));

        if((lado1 == lado2) && (lado1 == lado3)){
            JOptionPane.showMessageDialog(null,"Esse é um triangulo Equilátero ");
        }else if(lado1 == lado2 && lado1 != lado3){
            JOptionPane.showMessageDialog(null, "Esse é um triangulo Isosceles");
        }else if((lado1 == lado3) && (lado1 != lado2)){
            JOptionPane.showMessageDialog(null,"Esse é um triangulo Isosceles ");
        }else if(lado2 != lado1 && lado2 == lado3){
            JOptionPane.showMessageDialog(null,"Esse é um triangulo Isosceles ");
        }else if(lado1 != lado2 && lado1 != lado3){
            JOptionPane.showMessageDialog(null, "Esse é um triangul Escaleno");
        }
        
        /*equilatero , isosceles, escaleno
        eqilatero = 3 lados iguais
        isosceles = 2 lados iguais 
        escaleno = 3 lados diferentes
        */
    }
}


/*if((lado1 == lado2) && (lado1 == lado3)){
    JOptionPane.showMessageDialog(null,"Esse é um triangulo Equilatero ");
}else if(lado1 == lado2 && lado1 != lado3){
    JOptionPane.showMessageDialog(null, "Esse é um triangulo isosceles");
}else if((lado1 != lado2) && (lado1 == lado3) && (lado3 != lado2)){
    JOptionPane.showMessageDialog(null,"Esse é um triangulo isosceles ");
}else if(lado1 != lado2 && lado2 != lado3){
    JOptionPane.showMessageDialog(null, "Esse é um triangul escaleno");
}*/

/* certo
if((lado1 == lado2) && (lado1 == lado3)){
    JOptionPane.showMessageDialog(null,"Esse é um triangulo Equilatero ");
}else if(lado1 == lado2 && lado1 != lado3){
    JOptionPane.showMessageDialog(null, "Esse é um triangulo isosceles");
}else if((lado1 != lado2) && (lado1 == lado3)){
    JOptionPane.showMessageDialog(null,"Esse é um triangulo isosceles ");
}else if(lado2 != lado1 && lado2 == lado3){
    JOptionPane.showMessageDialog(null,"Esse é um triangulo isosceles ");
}else if(lado1 != lado2 && lado1 != lado3){
    JOptionPane.showMessageDialog(null, "Esse é um triangul escaleno");
}*/