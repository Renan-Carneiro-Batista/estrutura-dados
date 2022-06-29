package arvore;

public class ExecArvore {

	public static void main(String[] args) {
		ArvoreBinario arvoreBinario = new ArvoreBinario();
		arvoreBinario.inserir(1);
		arvoreBinario.inserir(2);
		arvoreBinario.inserir(3);
		
		System.out.println(arvoreBinario.contagem(arvoreBinario.raiz));
	}

}
