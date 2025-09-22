package Lista2POOvitoriaRocha;

import java.util.Scanner;

public class Questao7N5 {
/*7. Escreva um programa que solicite dois caracteres de A a Z ao usuário e imprima o número de
    caracteres existente entre eles. Assuma que o usuário digite os 2 caracteres em ordem alfabética. Caso
    não o estejam, emitir mensagem de erro.

    Exemplo: Digite 2 caracteres.
    1º Caractere: j
    2º Caractere: t
    Resultado: j t O numero de caracteres entre eles é: 9*/

    static Scanner input = new Scanner(System.in);

    public static char lerCaractere(int ordem) {
        System.out.print(ordem + "º Caractere: ");
        return input.next().toUpperCase().charAt(0);
    }
    
    public static boolean validarOrdem(char char1, char char2) {
        return char1 <= char2;
    }
    
    public static int calcularDiferenca(char char1, char char2) {
        return (char2 - char1) - 1;
    }
    
    public static void mostrarResultado(char char1, char char2, int diferenca) {
        System.out.println("\n" + char1 + " " + char2 + 
                         " O número de caracteres entre eles é: " + diferenca);
    }
    
    public static void mostrarErro() {
        System.out.println("Erro: Os caracteres não estão em ordem alfabética!");
    }
    
    public void run() {
        System.out.println("Digite 2 caracteres de A a Z (em ordem alfabética):");
        
        char char1 = lerCaractere(1);
        char char2 = lerCaractere(2);
        
        if (validarOrdem(char1, char2)) {
            int diferenca = calcularDiferenca(char1, char2);
            mostrarResultado(char1, char2, diferenca);
        } else {
            mostrarErro();
        }
    }

}
