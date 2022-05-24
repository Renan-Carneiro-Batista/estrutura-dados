package arvore;

public class ArvoreBinario {
	private NoBinario root;
	
	public ArvoreBinario() {
		super();
		this.root = new NoBinario("raiz");
	}

	public ArvoreBinario(NoBinario root) {
		super();
		if (root == null) {
			this.root = new NoBinario("raiz");
		} else {
			this.root = root;
		}
	}

	public void addNo(String Add, String posicao, NoBinario noPai) {
		NoBinario noToAdd = new NoBinario(Add);
		if (noPai == null) {
			addFilho(noToAdd, posicao, root);
		} else {
			addFilho(noToAdd, posicao, noPai);
		}
	}
	
	public void removeNo(String posicao, NoBinario noPai) {
		if(posicao == "direita") {
			removeFilho("direita", root);
		}else {
			removeFilho("esquerda", root);
		}
	}
	
	private void addFilho(NoBinario noToAdd, String posicao, NoBinario pai) {
		if (posicao.equals("direita")) {
			pai.setDireita(noToAdd);
		} else {
			pai.setEsquerda(noToAdd);
		}
	}
	
	private void removeFilho(String posicao, NoBinario pai) {
		if (posicao.equals("direita")) {
			pai.setDireita(null);
		} else {
			pai.setEsquerda(null);
		}
	}
	
	public void buscaPreOrdem(NoBinario no) {
		System.out.print(no.getDescricao());
		
		if(no.getEsquerda() != null) {
			buscaPreOrdem(no.getEsquerda());
		}
		if(no.getDireita() != null) {
			buscaPreOrdem(no.getDireita());
		}
	}

	public boolean buscarNo(String descricao) {
			return busca(descricao, root);
	}
	
	public boolean busca(String descricao, NoBinario no) {
		if(no.getDescricao() == descricao) {
			return true;
		}
		if(no.getEsquerda() != null) {
			busca(descricao, no.getEsquerda());
		}
		if(no.getDireita() != null) {
			busca(descricao, no.getDireita());
		}
		
		return false;
	}
	
	public NoBinario getRoot() {
		return root;
	}

	public void setRoot(NoBinario root) {
		this.root = root;
	}
}
