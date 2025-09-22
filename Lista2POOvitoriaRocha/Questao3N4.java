package Lista2POOvitoriaRocha;

//import java.util.Random;
//import java.util.List;
import java.util.Scanner;

public class Questao3N4{
    /*3. Faça um programa que gera e escreve os números ímpares dos números lidos entre 100 e 200.*/

    static Scanner input = new Scanner(System.in);
    static int[] num;
    static int qntNumeros;

    public static void lerNumeros(){

        System.out.println("Informe quantos números vc deseja gerar: ");
        qntNumeros = input.nextInt();

        num = new int[qntNumeros];

        for(int i=0; i<qntNumeros; i++){
            System.out.printf("Digite o %dº número: ", i+1);
            num[i] = input.nextInt();  
        }
    }

    public static void impares(){
        
        System.out.println("\n---- números ímpares ----".toUpperCase());

        for(int i=0; i<qntNumeros; i++){
            if(num[i]>=100 && num[i]<=200){
                if (num[i]%2!=0) {
                    System.out.printf("%d", num[i]);
                }
            }
        }
    }

    public void run(){

        lerNumeros();
        impares();

    }

}