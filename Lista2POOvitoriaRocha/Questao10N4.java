package Lista2POOvitoriaRocha;

public class Questao10N4{
/*10. Faça um programa que conte de 1 até 100 e a cada múltiplo de 10 exiba uma mensagem: "Múltiplo de 10".*/

    public static void multiplo10(){
        for (int i = 1; i <= 100; i++) {
            System.out.print(i);
                
            if (i % 10 == 0) {
                System.out.print(" - Múltiplo de 10");
            }
                
            System.out.println();
        }
    }


    public void run(){

        multiplo10();
    }

}