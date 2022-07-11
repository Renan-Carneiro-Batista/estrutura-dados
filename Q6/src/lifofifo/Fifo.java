package lifofifo;

import java.util.LinkedList;
import java.util.Queue;

public class Fifo {
	public static void main(String[] args) {
        Queue fila = new LinkedList();

        for(int i = 0; i < 10000000; i++) {
        	fila.add(i);
        }
        

        System.out.println("Fila : " + fila);
    }
}
