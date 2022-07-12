package itemC;

public class ArvoreQuaseCompleta {

	static class No {
		int chave;
		No esquerda, direita;
	}

	static int profundidade(No no) {
		int d = 0;
		
		while (no != null) {
			d++;
			no = no.esquerda;
		}
		
		return d;
	}

	static boolean comparaEstritamenteBinaria(No root, int d, int level) {
		
		if (root == null) {
			return true;
		}	
		
		if (root.esquerda == null && root.direita == null) {
			return (d == level+1);
		}
		
		if (root.esquerda == null || root.direita == null) {
			return false;
		}
		
		return comparaEstritamenteBinaria(root.esquerda, d, level+1) && comparaEstritamenteBinaria(root.direita, d, level+1);
	}

	static boolean estritamenteBinaria(No root) {
		int d = profundidade(root);
		return comparaEstritamenteBinaria(root, d, 0);
	}

	static No novoNo(int k) {
		No no = new No();
		no.chave = k;
		no.direita = null;
		no.esquerda = null;
		
		return no;
	}

	public static void main(String args[]) {
		No root = null;
		root = novoNo(10);
		root.esquerda = novoNo(20);
		root.direita = novoNo(30);

		root.esquerda.esquerda = novoNo(40);
		root.esquerda.direita = novoNo(50);
		root.direita.esquerda = novoNo(60);
		root.direita.direita = novoNo(70);
		
		if (estritamenteBinaria(root) == true) {
			System.out.println("A árvore binária não é quase completa.");
		}else {
			System.out.println("A árvore binária é quase completa.");

		}
	}	
}
