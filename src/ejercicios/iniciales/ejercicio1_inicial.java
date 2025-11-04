package ejercicios.iniciales;

import java.util.Scanner;

public class ejercicio1_inicial {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int suma = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.println("Introduce el número " + i);
            int num = sc.nextInt();

            if(num>10){
                suma = suma + num;

            }
        }
        System.out.println("El resultado es " + suma);
    }
}
