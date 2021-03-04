package bubllesort;

public class BublleSort {
    public static void main(String[] args) {
        
        //variáveis
        int quantidade = 10;
        int aux;
        int[] array = new int[quantidade];
        boolean troca = true;
             
            //coloca valores aleatórios dentro do array
             for (int i = 0; i < array.length; i++) {
                     array[i] = (int) (Math.random()*quantidade);
             }
              
             //Algoritmo bubble sort
              while (troca) {
                   troca = false;
                   for (int i = 0; i < array.length - 1; i++) {
                       if (array[i] > array[i + 1]) {
                           aux = array[i];
                           array[i] = array[i + 1];
                           array[i + 1] = aux;
                           troca = true;
                       }
                   }
               }
             
              //imprimir os dados para o usuário
             for(int i = 0; i < array.length; i++){
                 System.out.println(array[i]);
             }
             

       }

}