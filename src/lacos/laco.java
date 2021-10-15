package lacos;

public class laco {


   public static void main(String[] args){
    // chamando o metodo criado fora da class main
    contador();
   }

    // criando um metodo que imprimir apenas numeros impares
    public static void contador(){
        for(int i = 0; i <= 50; i++){
            if(i % 2 !=0){
                System.out.println(i);
            }
        }
    

    }

}
 














