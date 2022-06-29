package arvore;

public class ArvoreBinario {

    public No raiz;

    class No {
        Integer valor;
        No filhoEsquerdo;
        No filhoDireito;

        public No(Integer valor) {
            this.valor = valor;
        }
    }

    public No inserir(Integer valor) {
        return this.inserir(new No(valor), raiz);
    }

    private No inserir(No novo, No anterior) {
        if (raiz == null) {
            raiz = novo;
            return raiz;
        }

        if (anterior != null) {
            if (novo.valor <= anterior.valor) {
                anterior.filhoEsquerdo = this.inserir(novo, anterior.filhoEsquerdo);
            } else if (novo.valor > anterior.valor) {
                anterior.filhoDireito = this.inserir(novo, anterior.filhoDireito);
            } else {
                return null;
            }
        } else {
            anterior = novo;
        }

        return anterior;
    }

    public int contagem(No no){
        return (no == null) ? 0 : no.valor + contagem(no.filhoEsquerdo) + contagem(no.filhoDireito);
    }
    
}

