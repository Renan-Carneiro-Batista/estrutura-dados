package lifofifo;

import java.util.Stack;

public class Lifo {
	public static void main(String[] args) {
        Stack pilha = new Stack();

        for(int i = 0; i < 10000000; i++) {
        	pilha.push(i);
        }

        System.out.println("Pilha: " + pilha);

    }
}
