package lifofifo;

import java.util.*;

public class Pilha{   

	static void pilha_push(Stack<Integer> stack) {
		for(int i = 0; i < 10000000; i++) {
			stack.push(i);
		}
	}

	static void pilha_pop(Stack<Integer> stack) {
		for(int i = 0; i < 10000000; i++) {
			Integer y = (Integer) stack.pop();
			System.out.println(y);
		}
	}

	static void topoDaPilha(Stack<Integer> stack) {
		Integer elemento = (Integer) stack.peek();
		System.out.println("\nElemento no topo da pilha: " + elemento);
	}
	
	public static void main (String[] args) {
     
		long tempoInicial = System.currentTimeMillis();
	 
		Stack<Integer> pilha = new Stack<Integer>();

		pilha_push(pilha);
		pilha_pop(pilha);
		pilha_push(pilha);
		topoDaPilha(pilha);
     
		long tempoTotal = System.currentTimeMillis() - tempoInicial;
     
		System.out.println("\nO algoritmo foi executado em " + tempoTotal + "ms.");
     
	}
}
