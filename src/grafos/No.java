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
}
