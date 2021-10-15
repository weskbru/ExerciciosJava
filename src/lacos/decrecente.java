package lacos;

public class decrecente {
    public static void main(String[] args){
        //chamando o metodo criado fora da class main
        contagem();
    }


    // criando um metodo que faz uma contagem regressiva de 30 a 1
    public static void contagem(){
        for(int contaregressiva = 30; contaregressiva >= 1; contaregressiva --){
            System.out.println(contaregressiva);
        }
    }






}
