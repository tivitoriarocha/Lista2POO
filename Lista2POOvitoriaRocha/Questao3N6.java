package Lista2POOvitoriaRocha;

import java.util.Scanner;

public class Questao3N6 {
/*3. Escreva um programa que deverá ter as seguintes opções:
    Opções Disponíveis
    1 - Carregar Vetor
    2 - Listar Vetor
    3 - Exibir apenas os números pares do vetor
    4 - Exibir apenas os números ímpares do vetor
    5 - Exibir a quantidade de números pares que existem nas posições ímpares do vetor
    6 - Exibir a quantidade de números ímpares que existem nas posições pares do vetor
    0 - Sair*/

    static Scanner scan = new Scanner(System.in);
    static int[] vetor;
    static int tamanho;

    public static void carregarVetor() {
        System.out.print("Digite o tamanho do vetor: ");
        tamanho = scan.nextInt();
        vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            vetor[i] = scan.nextInt();
        }
    }

    public static void listarVetor() {
        if (vetor == null) {
            System.out.println("Vetor ainda não foi carregado!");
            return;
        }
        System.out.println("\n--- Vetor Completo ---");
        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Posição %d -> %d%n", i, vetor[i]);
        }
    }

    public static void exibirPares() {
        if (vetor == null) {
            System.out.println("Vetor ainda não foi carregado!");
            return;
        }
        System.out.println("\n--- Números Pares ---");
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + " ");
            }
        }
        System.out.println();
    }

    public static void exibirImpares() {
        if (vetor == null) {
            System.out.println("Vetor ainda não foi carregado!");
            return;
        }
        System.out.println("\n--- Números Ímpares ---");
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] % 2 != 0) {
                System.out.print(vetor[i] + " ");
            }
        }
        System.out.println();
    }

    public static void paresEmPosicoesImpares() {
        if (vetor == null) {
            System.out.println("Vetor ainda não foi carregado!");
            return;
        }
        int cont = 0;
        for (int i = 0; i < tamanho; i++) {
            if (i % 2 != 0 && vetor[i] % 2 == 0) {
                cont++;
            }
        }
        System.out.println("\nQuantidade de números pares nas posições ímpares: " + cont);
    }

    public static void imparesEmPosicoesPares() {
        if (vetor == null) {
            System.out.println("Vetor ainda não foi carregado!");
            return;
        }
        int cont = 0;
        for (int i = 0; i < tamanho; i++) {
            if (i % 2 == 0 && vetor[i] % 2 != 0) {
                cont++;
            }
        }
        System.out.println("\nQuantidade de números ímpares nas posições pares: " + cont);
    }

    public void run() {
        int opcao;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Carregar Vetor");
            System.out.println("2 - Listar Vetor");
            System.out.println("3 - Exibir apenas os números pares do vetor");
            System.out.println("4 - Exibir apenas os números ímpares do vetor");
            System.out.println("5 - Exibir a quantidade de números pares nas posições ímpares");
            System.out.println("6 - Exibir a quantidade de números ímpares nas posições pares");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1: carregarVetor(); break;
                case 2: listarVetor(); break;
                case 3: exibirPares(); break;
                case 4: exibirImpares(); break;
                case 5: paresEmPosicoesImpares(); break;
                case 6: imparesEmPosicoesPares(); break;
                case 0: System.out.println("Encerrando programa..."); break;
                default: System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    
}
