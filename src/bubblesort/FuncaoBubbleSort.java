package bubblesort;

public class FuncaoBubbleSort {

    public static void bubleSort(int[] vetor) {

        int aux;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {

                if (vetor[j] > vetor[j + 1]) {

                    System.out.println(" testa " + vetor[j] + " > " + vetor[j + 1] + " True");
                    System.out.println(" Troca " + vetor[j] + " e " + vetor[j + 1]);

                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    
                    vetor[j + 1] = aux;

                    for (int k = 0; k < 5; k++) {
                        System.out.print(" " + vetor[k]);
                    }
                    System.out.println();
                    System.out.println();
                    FuncaoBubbleSort.linha();
                } else if (vetor[j] < vetor[j + 1]) {

                    System.out.println(" testa " + vetor[j] + " > " + vetor[j + 1] + " False");

                }

            }

        }
    }
    
    public static void linha (){
        
    System.out.println ("--------------------------------------------");    
        
    }

}
