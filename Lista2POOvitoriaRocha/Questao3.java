package Lista2POOvitoriaRocha;

import java.util.Scanner;

public class Questao3 {
    /*3. Tendo como dados de entrada a altura e o sexo de uma pessoa, faça um programa que calcule seu
            peso ideal, utilizando as seguintes fórmulas: (h = altura)
                Para homens: (72.7*h) - 58
                Para mulheres: (62.1 *h) - 44.*/

    static Scanner input = new Scanner(System.in);
    static float altura;
    static char sexo; 

    public static void calcHomem(){
        System.out.printf("Seu peso ideal é: %.2f", (altura*72.7)-58);
    }

    public static void calcMulher(){
        System.out.printf("Seu peso ideal é: %.2f", (altura*62.1)-44);
    }

    public void run(){
        
        System.out.println("Informe sua altura: ");
        altura = input.nextFloat();
        System.out.println("Informe seu sexo biológico: ");
        sexo = input.next().toUpperCase().charAt(0); 

        if(sexo == 'F'){
            calcMulher();
        }else if(sexo == 'M'){
            calcHomem();
        }else{
            System.out.println("ERRO, Tente novamente!");
        }

    }
}
