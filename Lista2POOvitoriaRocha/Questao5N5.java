package Lista2POOvitoriaRocha;

import java.util.Scanner;

public class Questao5N5 {
/*5. Leia 2 vetores de inteiros V1 e V2 de N componentes cada (no máximo 50). Determine e imprima
    quantas vezes que V1 e V2 possuem valores idênticos nas mesmas posições.
    static Scanner input = new Scanner(System.in);*/

    static Scanner input = new Scanner(System.in);

     public static int lerTamanho() {
        int n;
        do {
            System.out.print("Quantos componentes (máximo 50)? ");
            n = input.nextInt();
        } while (n < 1 || n > 50);
        return n;
    }
    
    public static int[] lerVetor(String nome, int n) {
        int[] vetor = new int[n];
        System.out.println("\nDigite os " + n + " elementos do vetor " + nome + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(nome + "[" + i + "] = ");
            vetor[i] = input.nextInt();
        }
        return vetor;
    }
    
    public static int contarIguais(int[] v1, int[] v2) {
        int iguais = 0;
        for (int i = 0; i < v1.length; i++) {
            if (v1[i] == v2[i]) {
                iguais++;
            }
        }
        return iguais;
    }
    
    public static void mostrarVetores(int[] v1, int[] v2) {
        System.out.print("\nV1: ");
        for (int i = 0; i < v1.length; i++) {
            System.out.print(v1[i] + " ");
        }
        
        System.out.print("\nV2: ");
        for (int i = 0; i < v2.length; i++) {
            System.out.print(v2[i] + " ");
        }
        System.out.println();
    }
    
    public static void mostrarResultado(int iguais) {
        System.out.println("Valores idênticos nas mesmas posições: " + iguais);
    }
    
    public void run() {
        int n = lerTamanho();
        int[] v1 = lerVetor("V1", n);
        int[] v2 = lerVetor("V2", n);
        
        mostrarVetores(v1, v2);
        
        int resultado = contarIguais(v1, v2);
        mostrarResultado(resultado);
    }

}
