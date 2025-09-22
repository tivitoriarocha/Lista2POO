package Lista2POOvitoriaRocha;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Questao9N4 {
    /*9. Escreva um programa que leia um conjunto de números positivos e exiba o menor e o maior.
    Suporemos que o número de elementos deste conjunto não é conhecido, e que um número negativo
    será utilizado para sinalizar o fim dos dados.*/

    static Scanner input = new Scanner(System.in);
    static List<Double> numeros = new ArrayList<>();

    public static void lerConjunto(){

        
        double num;
        
        System.out.println("Digite os dados agora");
        System.out.println("Para encerrar, digite um número negativo");
        
        while (true) {

            System.out.println("Digite um número: ");
            num = input.nextDouble();
            if(num<0){
                break;
            }else{
                numeros.add(num);
            }
        }
        

    }

    public static void menorMaior(){
        
        double menor = numeros.get(0);
        double maior = numeros.get(0);

        for(Double numero : numeros){
            if(numero<menor){
                menor = numero;
            }
            if(numero>maior){
                maior = numero;
            }
        }


        System.out.print("\nNúmeros da Coleção");
        for(Double numero : numeros){
            System.out.printf("\n%f", numero);
        }

        System.out.printf("%nMAIOR - %f", maior);
        System.out.printf("%nMENOR - %f", menor);
    }

    public void run(){

        lerConjunto();
        menorMaior();

    }

}
