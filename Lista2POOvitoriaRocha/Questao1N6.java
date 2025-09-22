package Lista2POOvitoriaRocha;

import java.util.Scanner;

public class Questao1N6 {
/*1. Escreva um programa que calcule e retorne o salário atualizado através do método REAJUSTE. 
    O método deve receber o valor do salário e o índice de reajuste.*/


    static Scanner scan = new Scanner(System.in);
    static double salario;
    static double indice;
    static double novoSalario;

    public static void lerDados() {
        System.out.print("Digite o salário atual: ");
        salario = scan.nextDouble();

        System.out.print("Digite o índice de reajuste (em %): ");
        indice = scan.nextDouble();
    }

    public static void reajuste() {
        novoSalario = salario + (salario * (indice / 100));
    }

    public static void mostrarResultado() {
        System.out.println("\n--- Resultado ---");
        System.out.printf("Salário antigo: R$ %.2f%n", salario);
        System.out.printf("Índice de reajuste: %.2f%%%n", indice);
        System.out.printf("Novo salário: R$ %.2f%n", novoSalario);
    }

    public void run() {
        lerDados();
        reajuste();
        mostrarResultado();
    }
}

