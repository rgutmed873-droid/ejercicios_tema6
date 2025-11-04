package ejercicios.iniciales;

import java.util.Scanner;

public class ejercicio3_inicial {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = pedirNumero("Dime cuantos número quieres");
        int negativo = 0;
        int positivos = 0;
        for (int i = 0; i < numero; i++) {
            System.out.println("Introduce el numero " + i+1);
            int num = sc.nextInt();
            if (i <0){

                negativo ++;
                System.out.println("Los números negativos introducidos son " + negativo);
            } else  {

                positivos ++;
                System.out.println("Los número positivos introducidos son " + positivos);
            }

        }
    }

    public static int pedirNumero(String msg){

        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        int num=sc.nextInt();
        return  num;
    }
}
