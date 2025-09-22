package Lista2POOvitoriaRocha;

import java.util.Scanner;

public class Questao7N4{
    /*7. Escreva um programa que calcule e exiba a soma dos quadrados dos 20 primeiros números inteiros
    positivos ímpares a partir do número informado pelo usuário menor que 10 e maior que zero.*/

    Scanner input = new Scanner(System.in);
    static int num;

    public static void calculo(){
        
        int proxNumero = num, quadrado, somaImpar = 0, cont = 0;

        System.out.println("---- números ímpares e soma ----".toUpperCase());

        while (cont<20){
            if (proxNumero%2!=0) {
                quadrado = proxNumero^2;
                somaImpar = somaImpar + quadrado;
                cont++;
                System.out.printf("\n%d ", proxNumero);
                
            }
            proxNumero ++;
        }          

        System.out.printf("\nA soma é: %d", somaImpar);
    }

    public void run(){

            System.out.println("Número inteiro < 10 e > 0: \n");
            num = input.nextInt();
            if (num<10 && num>0) {
                calculo();
            }else{
                System.out.println("NÚMERO INADEQUADO!");
            }              

    }

}