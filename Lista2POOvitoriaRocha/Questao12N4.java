package Lista2POOvitoriaRocha;

import java.util.Scanner;

public class Questao12N4 {
/*12. A Secretaria de Meio Ambiente que controla o índice de poluição mantém 03 grupos de indústrias que
        são altamente poluentes do meio ambiente. O índice de poluição aceitável varia de 0,05 até 0,25. Se o
        índice sobe para 0,3 as indústrias do 1º grupo são intimadas a suspenderem suas atividades, se o índice
        crescer para 0,4 as industrias do 1º e 2º grupo são intimadas a suspenderem suas atividades, se o índice
        atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades. Faça um programa que
        leia o índice de poluição medido e emita a notificação adequada aos diferentes grupos de empresas. O
        algoritmo só deve parar de rodar quando o usuário responder "S" na seguinte pergunta, "Deseja
        encerrar o programa?" ou o índice for 0,0.*/

    static Scanner input = new Scanner(System.in);
    
    public static double lerIndice() {
        System.out.print("Digite o índice de poluição: ");
        double indice = input.nextDouble();
        return indice;
    }

    public static void verificarNotificacao(double indice) {
        if (indice >= 0.5) {
            System.out.println("NOTIFICAÇÃO: Todos os grupos devem paralisar atividades!");
        } else if (indice >= 0.4) {
            System.out.println("NOTIFICAÇÃO: 1º e 2º grupos devem suspender atividades!");
        } else if (indice >= 0.3) {
            System.out.println("NOTIFICAÇÃO: 1º grupo deve suspender atividades!");
        } else if (indice >= 0.05) {
            System.out.println("Índice dentro do aceitável");
        } else {
            System.out.println("Índice abaixo do mínimo");
        }
    }

    public static boolean perguntarSeEncerra() {
        System.out.print("Deseja encerrar o programa? (S/N): ");
        String resposta = input.next();
        return resposta.equalsIgnoreCase("S");
    }

    public void run() {
        System.out.println("=== CONTROLE DE POLUIÇÃO ===");
        
        while (true) {
            double indice = lerIndice();
            
            if (indice == 0.0) {
                System.out.println("Índice zerado. Programa encerrado.");
                break;
            }
            
            verificarNotificacao(indice);
            
            if (perguntarSeEncerra()) {
                System.out.println("Encerrando programa...");
                break;
            }
            System.out.println("----------------------");
        }
    }

}
