package main;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String args[]) {
		System.out.println("Insertion sort");
		final int MAX_SIZE_ARRAY = 20;
		final int MAX_NUMBER = 100;
		Random random = new Random();
		int tamanhoArrayAleatorio = random.nextInt(MAX_SIZE_ARRAY);
		int[] vetor = new int[tamanhoArrayAleatorio];
		
		for(int i = 0 ; i < tamanhoArrayAleatorio; i++) {
			vetor[i] = random.nextInt(MAX_NUMBER);
		}
		
		imprimeVetor(vetor);
		if(vetor.length >= 2)
			insertionSort(vetor);
		imprimeVetor(vetor);
	}
	
	private static void insertionSort(int[] numArray) {
		for(int k=1; k<numArray.length; k++)   {  
	        int temp = numArray[k];  
	        int j= k-1;  
	        while(j>=0 && temp <= numArray[j])   {  
	            numArray[j+1] = numArray[j];   
	            j = j-1;  
	        }  
	        numArray[j+1] = temp;  
	        imprimeVetor(numArray);
	    }  
	}
	
	private static void imprimeVetor(int[] vetor) {
		String numeros = "";
		for(int i = 0 ; i < vetor.length; i++) {
			numeros += vetor[i];
			numeros += ",";
		}
		System.out.println(numeros);
	}
}
