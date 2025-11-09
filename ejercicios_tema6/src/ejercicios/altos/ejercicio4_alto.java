package ejercicios_tema6.src.ejercicios.altos;

import java.util.Scanner;

public class ejercicio4_alto {
    static void main(String[] args) {

        int num;
        int numeroPositivos = 0;
        int numeroNegativos = 0;
        do {
            num = numeroUsuario("Dame un número");
            if (num > 0){
                numeroPositivos++;
                System.out.println("Los numeros positivos son " + numeroPositivos);
            }else if (num < 0){
                numeroNegativos++;
                System.out.println("Los numeros negativos son " + numeroNegativos);
            }
        }

        while (num != 0);
        System.out.println("Operaciones finalizadas");

    }
    private static int numeroUsuario (String msg){
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        int numero = sc.nextInt();
        return numero;
    }
}
