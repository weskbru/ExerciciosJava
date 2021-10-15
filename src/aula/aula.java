package aula;

public class aula {
  int x;

  public aula(int y){
    x = y;
  }

  public static void main(String[] args) {
    aula myobj = new aula(3);

    System.out.println(myobj.x);
  }

  
}







/*==================================================

public static void impar(){

  for(int i = 0; i <= 10; i++){
      if(i % 2 != 0){
        System.out.println(i);
      }
  }
}*==========================================================/


/*==========================================================

 // criando uma funçao que retorne algo "int"
 static int multiplica(int a , int b){
    int mult = a * b;
    return mult;
  }


  // chamando o retorno da funçao
  public static void main(String[] args){
    System.out.println("retornando uma multiolicaçao na funçao");
    System.out.println(multiplica(10, 3));
  }

*=====================================================/






/* usando um metodo interno ==================================

 static void pares(){
   for(int i = 0; i < 10; i++){
    if( i % 2 == 0){
      System.out.println(i);
    }
   }
 }

 public static void main(String[] args){
   System.out.println("estou usando um metodo intrerno para ler numeros parees:");
   pares();
 }
==========================================================================*/





 /* tabuada ===========================================

 int valor = Integer.parseInt
 (JOptionPane.showInputDialog("digite um valor que voce deseja ver a tabuada"));

 for( int i = 0; i <= 10; i++){
   JOptionPane.showMessageDialog(null, valor + " x "+ i + " = "+(valor * i));
 }*=======================================================/



/* incrementaçao=====================================

for(int i = 30; i > 0; i--){
  System.out.println(i);

}*===================================================/



/* mostra apenas numero impares================================

for(int impar = 0; impar < 20; impar++){
  if(impar % 2 != 0){
    System.out.println(impar);
  }

}*====================================================/



/* mostra se um numero e par ou impar==================

    public static void main(String[] args){
   int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero :"));

   int resultado = num % 2;

   if(resultado == 0){
        JOptionPane.showMessageDialog(null, "o numero digitado é par" );
   }else{
    JOptionPane.showMessageDialog(null, "o numero digitado é impar" );
   }

 }
 *================================================================/
 

 
 
    /*public static void main(String[] args){
      int num , poi;

      Scanner in = new Scanner(System.in);
      System.out.println("Digite um numero");

      num = in.nextInt();
      poi = (num % 2 );

      if(poi == 0){
        System.out.println("o numero " +num+ " par");
      }else{
        System.out.println("o numero "+num+ " impar");
      }
  } */
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    /* public static void main(String[] args){
        // ccomeça com uma variavel valor 0
        int i = 0;
        // faz a comparaçao da variavel com o valor escolhido
        while(i < 4){
            System.out.println(i); // imprimir a variavel 
            i++; // incrementa a variavel ate ela atingir o valor escolhido 
        }
        
    }*/
   

