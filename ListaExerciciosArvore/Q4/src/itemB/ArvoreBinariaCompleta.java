package itemB;

class No {
	int data;
	No esquerda, direita;
	
    No(int item) {
        data = item;
        esquerda = direita = null;
    }
}
  
public class ArvoreBinariaCompleta {
	No root;
  
    int contarNos(No root) {
    	if (root == null) {
        	return (0);
        }
        return (1 + contarNos(root.esquerda) + contarNos(root.direita));
    }
    
    boolean eCompleto(No root, int index, int number_nodes) {
    	
    	if (root == null) {       
    		return true;
    	}
    	
        if (index >= number_nodes) {
        	return false;
        }
        return (eCompleto(root.esquerda, 2 * index + 1, number_nodes)
        		&& eCompleto(root.direita, 2 * index + 2, number_nodes));
  }
    public static void main(String args[]) {
    	ArvoreBinariaCompleta arvore = new ArvoreBinariaCompleta();
        
    	//Árvore Binária incompleta
        //arvore.root = new No(1);
        //arvore.root.esquerda = new No(2);
        //arvore.root.direita = new No(3);
        //arvore.root.esquerda.direita = new No(5);
        //arvore.root.esquerda.esquerda = new No(4);
        //arvore.root.direita.direita = new No(6);
        
    	//Árvore Binária Completa
        No root = new No(1);
        root.esquerda = new No(2);
        root.direita = new No(3);
        root.esquerda.esquerda = new No(4);
        root.esquerda.direita = new No(5);
        root.direita.direita = new No(6);
        
        int contagem_no = arvore.contarNos(arvore.root);
        int index = 0;
          
        if (arvore.eCompleto(arvore.root, index, contagem_no)) {
            System.out.print("A árvore binária é completa.");
        }else {
            System.out.print("A árvore binária não é completa.");
        }
    }
}
