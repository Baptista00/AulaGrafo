package grafos;

public class No {

    String nome;
    No[] vizinho;
    int quantidadeVizinho;

    public No(String nome) {
        this.nome = nome;

        vizinho = new No[10];
        quantidadeVizinho = 0;
    }

    public void adcionarVizinho(No no) {
        if (quantidadeVizinho <= 10) {
            vizinho[quantidadeVizinho] = no;
            quantidadeVizinho++;
        }
    }

    public String toString() {
        return nome;
    }
}
