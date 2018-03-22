public class Ordenacao{

   public static int[] bubbleSort(int[] vetor){
      
      int aux;
      
      for(int pos1 = 0; pos1 < vetor.length; pos1++){
         for(int pos2 = 0; pos2 < (vetor.length-1);pos2++){
            if(vetor[pos2] > vetor[pos2+1]){
               aux = vetor[pos2];
               vetor[pos2] = vetor[pos2+1];
               vetor[pos2+1] = aux;
            }      
         }
      }
      
      return vetor;
   }
   
     public static int[] bubbleSortInvert(int[] vetor){
      
      int aux;
      
      for(int pos1 = vetor.length-1; pos1 > 0; pos1--){
         for(int pos2 = vetor.length-1; pos2 > 0; pos2--){
            if(vetor[pos2] < vetor[pos2-1]){
               aux = vetor[pos2];
               vetor[pos2] = vetor[pos2-1];
               vetor[pos2-1] = aux;
            }      
         }
      }
      
      return vetor;
   }
   
   
   
   public static void selectionSort(int array[]){
      for(int i = 0; i < array.length-2; i++){
         int menor = array[i];
         for(int j = i+1; j < array.length-1;i++){
            if(array[j] < menor){
               menor = array[j];
            }else{
               break;
            }
         }
         int aux = array[i];
         array[i] = menor;
         array[menor]=aux;
      }
      
      for(int k = 0; k <= array.length-1; k++){
         System.out.println(array[k]);
      }
   }

public static void main (String args[]){

   int[] vet = {1,5,0,3,7,9,12};
   int[] array = bubbleSort(vet);
   
   for(int i = 0; i < array.length; i++){
      System.out.println(array[i]);
   }
   
   
   int [] vet2 = {9,8,0,10,65,1,2};
   int[] array2 = bubbleSortInvert(vet2);
   
   for(int i = 0; i < array2.length; i++){
      System.out.println(array2[i]);
   }
   
   selectionSort(vet2);




   }

}