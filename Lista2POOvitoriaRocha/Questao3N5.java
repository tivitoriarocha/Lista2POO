package Lista2POOvitoriaRocha;

import java.util.Scanner;

public class Questao3N5 {
/*3. Considere um vetor de 10 números inteiros positivos maiores que zero e um único número inteiro, também positivo e maior que zero. Faça um programa para:
    a. ler pelo teclado o vetor;
    b. ler pelo teclado o número X;
    c. dizer quantos números no vetor são maiores que X, menores que X e iguais a X.*/

    static Scanner input = new Scanner(System.in);

    public static int[] lerVetor() {
        int[] vetor = new int[10];
        System.out.println("Digite 10 números inteiros positivos:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = input.nextInt();
        }
        return vetor;
    }
    
    public static int lerX() {
        System.out.print("\nDigite o número X: ");
        return input.nextInt();
    }
    
    public static void analisarVetor(int[] vetor, int x) {
        int maiores = 0;
        int menores = 0;
        int iguais = 0;
        
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > x) {
                maiores++;
            } else if (vetor[i] < x) {
                menores++;
            } else {
                iguais++;
            }
        }
        
        System.out.println("\nResultados:");
        System.out.println("Maiores que X: " + maiores);
        System.out.println("Menores que X: " + menores);
        System.out.println("Iguais a X: " + iguais);
    }
    
    public static void mostrarVetor(int[] vetor) {
        System.out.print("Vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
    
    public void run() {
        int[] vetor = lerVetor();
        int x = lerX();
        
        mostrarVetor(vetor);
        System.out.println("X = " + x);
        
        analisarVetor(vetor, x);
    }

}
