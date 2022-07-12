package itemA;

class No {
	int data;
	No esquerda, direita;
	
	No(int item) {
		data = item;
		esquerda = direita = null;
	}
}

public class ArvoreEstritamenteBinaria {
	No root;
   
	boolean estritamenteBinaria(No no) {
		if(no == null) {
			return true;
		}
		
		if(no.esquerda == null && no.direita == null ) {
			return true;
		}
		if((no.esquerda!=null) && (no.direita!=null)) {
			return (estritamenteBinaria(no.esquerda) && estritamenteBinaria(no.direita));
		}
		
		return false;
 }

	public static void main(String args[]) {
		ArvoreEstritamenteBinaria arvore = new ArvoreEstritamenteBinaria();
		arvore.root = new No(10);
		arvore.root.esquerda = new No(20);
		arvore.root.direita = new No(30);
		arvore.root.esquerda.direita = new No(40);
		arvore.root.esquerda.esquerda = new No(50);
		arvore.root.direita.esquerda = new No(60);
		arvore.root.esquerda.esquerda.esquerda = new No(80);
		arvore.root.direita.direita = new No(70);
		arvore.root.esquerda.esquerda.direita = new No(90);
		arvore.root.esquerda.direita.esquerda = new No(80);
		arvore.root.esquerda.direita.direita = new No(90);
		arvore.root.direita.esquerda.esquerda = new No(80);
		arvore.root.direita.esquerda.direita = new No(90);
		arvore.root.direita.direita.esquerda = new No(80);
		arvore.root.direita.direita.direita = new No(90);
       
		if(arvore.estritamenteBinaria(arvore.root)) {
			System.out.print("A árvore binária é estritamente binária.");
		}else {
			System.out.print("A árvore binária não é estritamente binária.");
		}
	}
}
