package Lista2POOvitoriaRocha;

import java.util.Scanner;
import static Lista2POOvitoriaRocha.Utilitarios.linha;
//import static Lista2POOvitoriaRocha.Utilitarios.print;
//import static Lista2POOvitoriaRocha.Utilitarios.println;
import static Lista2POOvitoriaRocha.Utilitarios.printf;


public class Questao5N4 {
    /*5. Faça um programa para imprimir uma tabuada.*/

    static Scanner scan = new Scanner(System.in);

    public static void tabuada(){

        int num;
        System.out.println("\nTaboada de que número? ");
        num = scan.nextInt();

        linha();
        printf("TABOADA DO %d\n", num);
        linha();
        for(int i=1; i<=10; i++){
            printf("%d * %d = %d\n", num, i, num*i);
        }

    }

    public void run(){
        
        tabuada();

    }

}
