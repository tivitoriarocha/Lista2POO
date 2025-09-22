package Lista2POOvitoriaRocha;

import java.util.Scanner;

public class Questao1N5 {
/*1. Dada uma sequência de n números (vetor de inteiros), imprimi-la na ordem inversa que foi realizada a
    leitura.*/    

    static Scanner input = new Scanner(System.in);

    public static int[] lerNumeros(int n) {
        int[] vetor = new int[n];
        
        System.out.println("Digite " + n + " números:");
        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = input.nextInt();
        }
        return vetor;
    }

    public static void imprimirOrdemNormal(int[] vetor) {
        System.out.print("\nOrdem normal: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    public static void imprimirOrdemInversa(int[] vetor) {
        System.out.print("Ordem inversa: ");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
    
    public void run() {
        System.out.print("Quantos números você vai digitar? ");
        int n = input.nextInt();
        
        int[] numeros = lerNumeros(n);
        imprimirOrdemNormal(numeros);
        imprimirOrdemInversa(numeros);
    }

}
