package Lista2POOvitoriaRocha;

import java.util.Scanner;

public class Questao2 {
    /*2. Escreva um programa que leia dois números inteiros e apresente as opções para usuário escolher o que
        deseja realizar:
        1 – Verificar se um dos números lidos é ou não múltiplo do outro
        2 – Verificar se os dois números lidos são pares
        3 – Verificar se a média dos dois números é maior ou igual a 7.
        4 – Sair
*/

    static Scanner input = new Scanner(System.in);
    static int num1, num2;

    public static void menu(){
        System.out.println("--- opçoes de operações ---".toUpperCase());
        System.out.println("1 - Verificar se um dos números lidos é ou não múltiplo do outro.");
        System.out.println("2 - Verificar se os dois números lidos são pares.");
        System.out.println("3 - Verificar se a média dos dois números é maior ou igual a 7.");
        System.out.println("4 - Sair");
        System.out.println();
    }

    public static void lerNum(){
        System.out.print("1° Número");
        num1 = input.nextInt();
        System.out.print("\n2° Número");
        num2 = input.nextInt();
    }

    public static void multiplos(){
        if(num1%num2==0){
            System.out.printf("%d e %d são múltiplos!", num1, num2);
        }else{
            System.out.println("Não são múltiplos!");
        }
    }

    public static void pares(){
        if(num1%2==0 && num2%2==0){
            System.out.printf("%d e %d são pares", num1, num2);
        }else{
            System.out.println("Ambos ímpares!");
        }
    }

    public static void maiorIgual7(){
        float media = (num1+num2)/2;
        if(media>=7){
            System.out.printf("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
    }

    public void run(){

        int opcao;

        do{
            
            menu();
            System.out.print("Qual a operação? ");
            opcao = input.nextInt();

            switch(opcao){
                case 1:
                    lerNum();
                    multiplos();
                    break;
                case 2:
                    lerNum();
                    pares();
                    break;
                case 3:
                    lerNum();
                    maiorIgual7();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
                    break;

            }
        }while(opcao != 4);
    }

}
