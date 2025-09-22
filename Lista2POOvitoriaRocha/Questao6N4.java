package Lista2POOvitoriaRocha;

import java.util.Scanner;

public class Questao6N4{
    /*6. Escrever um programa que leia um conjunto de números positivos, e exiba se o número lido é par ou
    ímpar. Exiba ao final a soma total dos números pares lidos e também a soma dos números ímpares
    lidos. Suporemos que o número de elementos deste conjunto não é conhecido, e que um número
    negativo será utilizado para sinalizar o fim dos dados.*/

    static Scanner scan = new Scanner(System.in);

    static int[] num = new int[1000];
    static int qntNumeros = 0;

    public static void lerNumeros(){

        int i = 0;
        do {
            System.out.printf("Digite o %dº número: ", i+1);
            num[i] = scan.nextInt();
            if (num[i] >= 0) {
                i++;
                qntNumeros++;
            }
        } while (num[i] >= 0);
    }

    public static void paresEImpares(){

        int somaPar = 0;
        int somaImpar = 0;
        
        System.out.println("---- RESULTADOS ----");
        
        for(int i = 0; i < qntNumeros; i++){
            if(num[i] % 2 == 0){
                System.out.println(num[i] + " - PAR");
                somaPar += num[i];
            } else {
                System.out.println(num[i] + " - ÍMPAR");
                somaImpar += num[i];
            }
        }
        
        System.out.println("Soma dos pares: " + somaPar);
        System.out.println("Soma dos ímpares: " + somaImpar);
    }

    public void run(){
        lerNumeros();
        paresEImpares();
    }

}