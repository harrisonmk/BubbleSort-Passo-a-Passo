
package bubblesort;


public class BubbleSort {

   
    public static void main(String[] args) {
        
       

	int[] vetor = {20, 35, 15, 12, 25};
	//metodo bolha, bubble sort//

	for(int i = 0; i < 5; i++)
	{
		System.out.print (vetor[i] + " ");
	}
	
        System.out.println("\n");
	//bubleSort (vetor);

	System.out.println();

           FuncaoBubbleSort.bubleSort(vetor);

	System.out.println("\nOrdenacao Bubble Sort:");
	for(int i = 0; i < 5; i++)
	{

		System.out.print(vetor[i] + " ");

	}

	System.out.println();

    
    


        
        
        
    }
    
}
