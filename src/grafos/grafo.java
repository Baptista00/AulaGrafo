package grafos;

public class grafo {

    No[] nos;
    int quantidade;

    public grafo(){

        nos = new No[20];
        quantidade = 0;
    }
    public void criaNo(No no){

        nos[quantidade] = no;
        quantidade++;
        System.out.println("No" + no + "Adicionado");
    }
    public void adicionarArestas(No origem, No destino){

        origem.adcionarVizinho(destino);
        destino.adcionarVizinho(origem);
        System.out.println("Ligação entre" + origem + "<----->" + destino);
    }
    public No buscarNo(String nome) {
        for (int i = 0; i < quantidade; i++) {
           if(nos[i].nome.equals(nome)){
               return nos[i];
            }
        }
        return null;
    }
    public void mostrarGrafo(){
        System.out.println("GRAFO");

        for(int i = 0; i < quantidade; i++){
            No atual = nos[i];
            System.out.print("["+atual+"]");

            for (int j = 0; j < atual.quantidadeVizinho; j++){
                System.out.print("--->["+atual.vizinho[j]+"]");
            }
        }
        System.out.println();
    }
    public void bsucarProfundidade(No inicio){
        No[] visitados = new No[20];

        int quantidadeVisitado = 0;
        System.out.println("--Busca em Profundidade--");
        buscaProfundidadeRec(inicio,visitados,quantidadeVisitado);

    }
    private void buscaProfundidadeRec(No atual, No[] visitados, int quantidadeVisitado){
        visitados[quantidadeVisitado] = atual;
        quantidadeVisitado++;
        System.out.print(atual + "-->");

        for(int i = 0; i < atual.quantidadeVizinho; i++){
            No vizinho = atual.vizinho[i];
            boolean visitado = false;
            for (int j = 0; j < quantidadeVisitado; j++) {
                if (visitados[j] == vizinho){
                    visitado = true;
                    }
                }
            if (!visitado){
                buscaProfundidadeRec(vizinho,visitados,quantidadeVisitado);
            }
            }
        }
    }

