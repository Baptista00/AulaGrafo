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
        }
    }
}
