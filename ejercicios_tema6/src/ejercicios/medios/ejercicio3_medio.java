package ejercicios_tema6.src.ejercicios.medios;

import java.util.Scanner;

public class ejercicio3_medio {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = pedirNumeroUsuario("Dame un número");

        int numeroMultiplicar;
        int numeroLimite = 100;

        System.out.println("Los múltiplos de " + numero + " " + "menores de " + numeroLimite + " " + "son:");

        for (int i = 1; numero * i < numeroLimite; i++) {
            numeroMultiplicar = numero * i;
            System.out.println(numeroMultiplicar);
        }
        sc.close();

    }

    private static int pedirNumeroUsuario(String msg){

        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        int num = sc.nextInt();
        return num;
    }
}
