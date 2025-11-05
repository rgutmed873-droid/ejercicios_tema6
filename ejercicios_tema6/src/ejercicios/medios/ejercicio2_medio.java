package medios;

import java.util.Scanner;

public class ejercicio2_medio {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = pedirNumero("Dime cuantos números vas a introducir");

        int mayor = 0;
        int menor = 0;

        for (int i = 0; i < num; i++) {
            System.out.println("Introduce el valor " + (i+1)) ;
            int num1 = sc.nextInt();
            if (i == 0){
                mayor = num1;
                menor = num1;

            }else {
                if (num1 > mayor){
                    mayor = num1;
                }
                if (num1 < menor){
                    menor = num1;
                }
            }
        }
        System.out.println("El numero mayor es " + mayor);
        System.out.println("El numero menor es  " + menor);
    }

    private static int pedirNumero(String msg) {

        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        int numero = sc.nextInt();
        return numero;
    }

}
