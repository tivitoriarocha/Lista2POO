package Lista2POOvitoriaRocha;

import java.util.Scanner;

public class Questao2N5 {
/*2. Dados dois vetores x e y, ambos com n elementos, determinar o produto escalar desses vetores. Ou
    seja, realizar a soma de todos dos resultados da multiplicação de x[i] por y[i].*/

    static Scanner input = new Scanner(System.in);

    public static int lerTamanho() {
        System.out.print("Quantos elementos? ");
        return input.nextInt();
    }
    
    public static int[] lerVetor(String nome, int n) {
        int[] vetor = new int[n];
        System.out.println("Digite vetor " + nome + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(nome + "[" + i + "] = ");
            vetor[i] = input.nextInt();
        }
        return vetor;
    }
    
    public static int calcularSoma(int[] x, int[] y) {
        int soma = 0;
        for (int i = 0; i < x.length; i++) {
            soma += x[i] * y[i];
        }
        return soma;
    }
    
    public static void mostrarResultado(int soma) {
        System.out.println("Produto escalar = " + soma);
    }
    
    public void run() {
        int n = lerTamanho();
        int[] x = lerVetor("X", n);
        int[] y = lerVetor("Y", n);
        int resultado = calcularSoma(x, y);
        mostrarResultado(resultado);
    }

}
