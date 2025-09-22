package Lista2POOvitoriaRocha;

//import java.util.Scanner;

public class Questao4N4{
    /*4. Faça um programa que exiba os números de 1 até 2000.*/

    //static Scanner input = new Scanner(System.in);

    public void run(){

        for(int i=1; i<=2000; i++){
            System.out.printf("%d  ", i );
            if(i%10==0){
                System.out.println("");
            }
        }

    }

}