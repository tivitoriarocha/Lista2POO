package Lista2POOvitoriaRocha;

import java.util.Random;
import java.util.Scanner;

public class Questao6N5 {
/*6. Fazer um programa que sorteie um número de 0 a 100 e que permita que o usuário (sem conhecer o
    número sorteado) tente acertar. Caso não acerte, o programa deve imprimir uma mensagem
    informando se o número sorteado é maior ou menor que a tentativa feita. Ao acertar o número, o
    programa deve imprimir a quantidade de tentativas feitas.*/    

    static Scanner input = new Scanner(System.in);
    static Random random = new Random();
    
    public static int sortearNumero() {
        return random.nextInt(101); // 0 a 100
    }
    
    public static int lerTentativa(int tentativa) {
        System.out.print("Tentativa " + tentativa + ": Digite um número (0-100): ");
        return input.nextInt();
    }
    
    public static void darDica(int numeroSorteado, int palpite) {
        if (palpite < numeroSorteado) {
            System.out.println("Dica: O número sorteado é MAIOR que " + palpite);
        } else {
            System.out.println("Dica: O número sorteado é MENOR que " + palpite);
        }
    }
    
    public static void mostrarResultado(int tentativas) {
        System.out.println("🎉 Parabéns! Você acertou!");
        System.out.println("Tentativas feitas: " + tentativas);
    }
    
    public void run() {
        int numeroSorteado = sortearNumero();
        int tentativas = 0;
        int palpite;
        
        System.out.println("=== JOGO DA ADIVINHAÇÃO ===");
        System.out.println("Tente adivinhar o número sorteado (0 a 100)");
        
        do {
            tentativas++;
            palpite = lerTentativa(tentativas);
            
            if (palpite == numeroSorteado) {
                mostrarResultado(tentativas);
            } else {
                darDica(numeroSorteado, palpite);
            }
            
        } while (palpite != numeroSorteado);
    }
    
}
