// Revis?o de vetor, declarar e instanciar vetor em java - Trabalho na memoria - Stack e Heap

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n]; //vari?vel vect apontando(instanciando) para o vetor em Heap (new double). Dados de aloca??o de vetor / matriz no Heap.
		
		//La?o for para incrementar os valores dentro do vetor.
		for (int i=0; i<n; i++) { // variavel i inicia com valor 0
			vect[i] = sc.nextDouble(); //ele retornar? o 'for' com 'i' igual a 1, e o vetor receber? os dados na posi??o 1 do vetor.
		}
		
		double sum = 0.0; //varivel da soma
		for (int i=0; i<n; i++) { //la?o pegando os valores do vector e somando dentro da soma.
			sum += vect[i];
		}
		
		double avg = sum / n; // fazendo a m?dia.
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
		
		
		sc.close();
	}

}
