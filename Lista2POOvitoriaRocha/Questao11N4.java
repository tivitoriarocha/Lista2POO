package Lista2POOvitoriaRocha;

import java.util.Scanner;

public class Questao11N4 {
/*11. Faça um programa que leia 10 valores inteiros e positivos e:
        Encontre o maior valor
        Encontre o menor valor
        Calcule a média dos números lidos*/


    static Scanner input = new Scanner(System.in);
    static int[] numeros = new int[10];

    public static void lerNumeros(){

        System.out.println("Digite 10 números inteiros e positivos:");
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = input.nextInt();
            
            // Validando se é positivo
            if (numero < 0) {
                System.out.println("Número inválido! Digite apenas positivos.");
                i--; // Volta uma posição para digitar novamente
            } else {
                numeros[i] = numero;
            }
        }
    }

    static int maior = numeros[0];
    static int menor = numeros[0];
    static double media;
    
    public static void maiorMenor(){
        
        int soma = 0;
        
        for (int i = 0; i < 10; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            soma += numeros[i];
        }

        media = (double) soma / 10;
    }

    public static void printar(){

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Números digitados: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }
        
        System.out.println("\nMaior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.printf("Média dos números: %.2f%n", media);
    }


    public void run(){
        lerNumeros();
        maiorMenor();
        printar();
    }

}
