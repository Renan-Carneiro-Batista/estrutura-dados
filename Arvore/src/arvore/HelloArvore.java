package arvore;

public class HelloArvore {

	public static void main(String[] args) {
		
		ArvoreBinario arvoreBinario = new ArvoreBinario();
		arvoreBinario.addNo("folha1", "esquerda", null);
		arvoreBinario.addNo("folha2", "direita", null);
		
		arvoreBinario.removeNo("esquerda", arvoreBinario.getRoot());
		arvoreBinario.removeNo("direita", arvoreBinario.getRoot());
		
		arvoreBinario.buscarNo("raiz");
	}
}
