package lifofifo;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		long tempoInicial = System.currentTimeMillis();
		
		Queue<Integer> fila = new LinkedList<>();
		
		for (int i = 0; i < 10000000; i++) {
			fila.add(i);
		}
		
		long tempoTotal = System.currentTimeMillis() - tempoInicial;
		
		System.out.println("Início da fila: " + fila.peek());
		System.out.println("Tamanho da fila: " + fila.size());
		 
		System.out.println("\nO algoritmo foi executado em " + tempoTotal + "ms.");
	}
}
