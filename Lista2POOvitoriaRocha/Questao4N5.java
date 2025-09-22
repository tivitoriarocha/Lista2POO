package Lista2POOvitoriaRocha;

import java.util.Scanner;

public class Questao4N5 {
/*4. Uma agência de publicidade pediu à agência de modelos Luz & Beleza para encontrar uma modelo que
    tenha idade entre 18 e 20 anos para participar de uma campanha publicitária milionária de produtos de
    beleza. Foram inscritas 20 candidatas e, ao se inscreverem, forneceram nome e idade. Tais informações
    foram armazenadas em 2 vetores distintos. Faça um programa para imprima o vetor que contém os
    nomes das candidatas aptas a concorrer a uma vaga para a campanha milionária.*/

    static Scanner input = new Scanner(System.in);

    public void run() {
        String[] nomes = new String[20];
        int[] idades = new int[20];
        
        System.out.println("Cadastro de 20 candidatas:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = input.next();
            System.out.print("Idade: ");
            idades[i] = input.nextInt();
        }
        
        System.out.println("\nCandidatas aptas (18-20 anos):");
        for (int i = 0; i < 20; i++) {
            if (idades[i] >= 18 && idades[i] <= 20) {
                System.out.println("- " + nomes[i] + " (" + idades[i] + " anos)");
            }
        }
    }
}
