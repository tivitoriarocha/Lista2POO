package Lista2POOvitoriaRocha;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Questao8N4 {
    /*8. Escreva um programa que calcule e exiba a média da nota dos alunos de uma turma em uma prova. O
        número de alunos é desconhecido. Os dados de um aluno são: número de matrícula e a sua nota na
        prova em questão.*/

    static Scanner scan = new Scanner(System.in);
    static List<Double> notas = new ArrayList<>();
    static List<Integer> matriculas = new ArrayList<>();

    public static void lerNotas(){
        
        System.out.println("Digite os dados dos alunos");
        System.out.println("Para encerrar, digite -1 na matrícula");
        
        while (true) {
            System.out.print("Número de matrícula: ");
            int matricula = scan.nextInt();
            
            if (matricula == -1) {
                break;
            }
            
            System.out.print("Nota do aluno: ");
            double nota = scan.nextDouble();
            
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Deve ser entre 0 e 10.");
                continue;
            }
            
            matriculas.add(matricula);
            notas.add(nota);
        }
    }

    public static void calcularMedia(){

        if (notas.isEmpty()) {
            System.out.println("Nenhum aluno foi informado.");
        } else {
            double soma = 0;
            for (double nota : notas) {
                soma += nota;
            }
            
            double media = soma / notas.size();
            
            System.out.println("\n--- Resultado ---");
            System.out.println("Total de alunos: " + notas.size());
            System.out.printf("Média da turma: %.2f%n", media);
        }
    }

    public static void escreverInfo(){

         System.out.println("\nAlunos e notas:");
            for (int i = 0; i < matriculas.size(); i++) {
                System.out.printf("Matrícula: %d - Nota: %.1f%n", matriculas.get(i), notas.get(i));
            }
    }
    
    public void run(){
        
        lerNotas();
        calcularMedia();
        escreverInfo();

    }
}
