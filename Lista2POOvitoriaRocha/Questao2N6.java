package Lista2POOvitoriaRocha;

import java.util.Scanner;

public class Questao2N6 {
/*2. Escreva um programa que verifique se um número é par ou ímpar através de um método chamado
    VERIFICA. O método deverá receber um número inteiro (n) e deverá retornar a mensagem "PAR" ou "ÍMPAR".*/  
    
    static Scanner scan = new Scanner(System.in);
    static int numero;

    public static void lerNumero() {
        System.out.print("Digite um número inteiro: ");
        numero = scan.nextInt();
    }

    public static String verifica(int n) {
        if (n % 2 == 0) {
            return "PAR";
        } else {
            return "ÍMPAR";
        }
    }

    public static void mostrarResultado() {
        String resultado = verifica(numero);
        System.out.printf("O número %d é %s.%n", numero, resultado);
    }

    public void run() {
        lerNumero();
        mostrarResultado();
    }

}
