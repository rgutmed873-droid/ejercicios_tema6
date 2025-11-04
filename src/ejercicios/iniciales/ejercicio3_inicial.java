package ejercicios.iniciales;

import java.util.Scanner;

public class ejercicio3_inicial {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = pedirNumero("Dime cuantos número quieres");

        for (int i = 0; i <= numero; i++) {
            System.out.println("Introduce el numero " + i);
            int num = sc.nextInt();
            if (i <0){

                int negativos = i++;
                System.out.println("Los números negativos introducidos son " + negativos);
            } else if (i>=0) {

                int positivos = i++;
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
