package Lista2POOvitoriaRocha;

//import static Utilitarios.*;
import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;

public class Questao1 {
    /*1. Escreva um programa que exiba as seguintes opções e realize os que se pede em cada uma delas:
    1 – Adição
    2 – Subtração
    3 – Multiplicação
    4 – Divisão */

    static Scanner input = new Scanner(System.in);
    static float num1, num2;

    public static void lerNum(){

        System.out.print("1º NÚMERO: ");
        num1 = input.nextFloat(); 
        System.out.print("2º NÚMERO: ");
        num2 = input.nextFloat(); 

    }

    public static void somar(){
        System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, num1 + num2);
    }

    public static void subtrair(){
        System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, num1 - num2);
    }

    public static void multiplicar(){
        System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, num1 * num2);
    }

    public static void dividir(){
        if (num2 == 0) {
            System.out.println("Erro: Não pode dividir por zero!");
        } else {
            System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, num1 / num2);
        }
    }

    public void run() {
        int opcao;

        System.out.println("---- CALCULADORA ----".toUpperCase());
        lerNum();

        do {    
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Novos números");
            System.out.println("0 - Sair");

            opcao = input.nextInt();

            switch (opcao) {
                 case 0:
                    break;
                case 1:
                    somar();
                    break;
                case 2:
                    subtrair();
                    break;
                case 3:
                    multiplicar();
                    break;
                case 4:
                    dividir();
                    break;
                case 5:
                    lerNum();                    
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

        } while (opcao!=0);
    }


}
