package ejercicios_tema6.src.ejercicios.altos;

import java.util.Scanner;

public class ejercicio3_alto {
    static void main(String[] args) {

        int numero;
        do {
            numero = numeroUsuario("Dame un número");
            if (numero != 0){
                System.out.println("La tabla de multiplicar de " + numero);
                for (int i = 0; i <= 10; i++) {
                    System.out.println(numero + " x " + i + " = " + (numero * i));
                }
            }
        }

        while (numero != 0);
        System.out.println("Operación finalizado");

    }

    private static int numeroUsuario (String msg){
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        int num = sc.nextInt();
        return num;
    }
}
