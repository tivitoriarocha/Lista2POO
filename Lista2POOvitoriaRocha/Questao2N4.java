package Lista2POOvitoriaRocha;

import java.util.Scanner;

public class Questao2N4 {
    /*2. Escreva um programa que leia:
        a quantidade de números que deverá processar;
        os números que deverá processar,e calcule e exiba, para cada número a ser processado o seu
        fatorial.
        Lembrete: O fatorial de um número N é dado pela fórmula: N! = 1 2 3 4 5 ... N*/

    static Scanner input = new Scanner(System.in);
    static int qntNumeros;
    static int[] numeros;
    static long[] fatoriais;

    public static void lerQntNumeros(){

        System.out.println("Informe a quatidade de números que deseja o fatorial: ");
        qntNumeros = input.nextInt();

        numeros = new int[qntNumeros];
        fatoriais = new long[qntNumeros];

        for(int i=0; i<=qntNumeros; i++){

            System.out.printf("Digite o %dº Número: ", (i+1));
            numeros[i] = input.nextInt();

        }
    }
    
    public static void fatorial(){
        
        System.err.println(" ");
        System.out.println("--- FATORIAIS ---");
        
        for(int i = 0; i < qntNumeros; i++) {
            long fatorial = 1;
            for(int j = 1; j <= numeros[i]; j++) {
                fatorial *= j;
            }
            fatoriais[i] = fatorial;
            System.out.printf("!%d = %d\n", numeros[i], fatoriais[i]);
        }
    }

    public void run(){
        lerQntNumeros();
        fatorial();
    }

}
