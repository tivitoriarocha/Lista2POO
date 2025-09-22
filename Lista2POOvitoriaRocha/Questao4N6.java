package Lista2POOvitoriaRocha;

import java.util.Scanner;

public class Questao4N6 {
/*4. Escreva um programa que calcule e retorne o tipo do triângulo quanto a sua classificação por lados, de
acordo com a descrição a seguir:
    Classificação por Lados
        Equilátero: Possui todos os três lados com a mesma medida.
        Isósceles: Tem dois lados com a mesma medida e um lado com medida diferente.
        Escaleno: Apresenta todos os três lados com medidas diferentes.
    O programa deve ter três métodos, um pra cada tipo, cada método deve verificar as condições e
    retornar true ou false. Esses métodos devem ser chamados passando os ângulos.*/    

    static Scanner scan = new Scanner(System.in);
    static double lado1, lado2, lado3;

    public static void lerLados() {
        System.out.print("Digite o valor do lado 1: ");
        lado1 = scan.nextDouble();
        System.out.print("Digite o valor do lado 2: ");
        lado2 = scan.nextDouble();
        System.out.print("Digite o valor do lado 3: ");
        lado3 = scan.nextDouble();
    }

    public static boolean equilatero(double a, double b, double c) {
        return (a == b && b == c);
    }

    public static boolean isosceles(double a, double b, double c) {
        return (a == b || a == c || b == c) && !equilatero(a, b, c);
    }

    public static boolean escaleno(double a, double b, double c) {
        return (a != b && a != c && b != c);
    }

    public static void mostrarResultado() {
        System.out.println("\n--- Resultado ---");
        if (equilatero(lado1, lado2, lado3)) {
            System.out.println("O triângulo é EQUILÁTERO.");
        } else if (isosceles(lado1, lado2, lado3)) {
            System.out.println("O triângulo é ISÓSCELES.");
        } else if (escaleno(lado1, lado2, lado3)) {
            System.out.println("O triângulo é ESCALENO.");
        } else {
            System.out.println("Os valores informados não formam um triângulo válido.");
        }
    }

    public void run() {
        lerLados();
        mostrarResultado();
    }

}
