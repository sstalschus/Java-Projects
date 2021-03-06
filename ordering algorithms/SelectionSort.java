public class SelectionSort {
	public static void main(String[] args) {

    //varáveis
    int[] array = {9,6,5,4,8,7,3};

    for(int j = 0; j < array.length; j++){

      int menor = j;

      for(int i = menor + 1; i < array.length; i++){
        if(array[i] < array[menor]){
            menor = i;
        }
      }

      if (menor != j) {
          int t = array[j];
          array[j] = array[menor];
          array[menor] = t;
      }
    }
    
    //imprime os valores
    for(int i = 0; i < array.length; i++){
        System.out.println(array[i]);
    }	
	}
}
