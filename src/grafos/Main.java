package grafos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        grafo g = new grafo();
        int opcao;

        do {
            System.out.println("\n===== MENU GRAFO =====");
            System.out.println("1 - Adicionar nó");
            System.out.println("2 - Adicionar aresta");
            System.out.println("3 - Mostrar grafo");
            System.out.println("4 - Busca em profundidade");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Nome do nó: ");
                    String nomeNo = scanner.nextLine();
                    g.criaNo(new No(nomeNo));
                    break;

                case 2:
                    System.out.print("Nome do nó de origem: ");
                    String origem = scanner.nextLine();
                    System.out.print("Nome do nó de destino: ");
                    String destino = scanner.nextLine();

                    No noOrigem = g.buscarNo(origem);
                    No noDestino = g.buscarNo(destino);

                    if (noOrigem == null || noDestino == null) {
                        System.out.println("Nó não encontrado!");
                    } else {
                        g.adicionarArestas(noOrigem, noDestino);
                    }
                    break;

                case 3:
                    g.mostrarGrafo();
                    break;

                case 4:
                    System.out.print("Nome do nó inicial: ");
                    String nomeInicio = scanner.nextLine();
                    No inicio = g.buscarNo(nomeInicio);

                    if (inicio == null) {
                        System.out.println("Nó não encontrado!");
                    } else {
                        g.bsucarProfundidade(inicio);
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}