package ejercicios_tema6.src.ejercicios.medios;

import java.util.Scanner;

public class ejercicio4_medio {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = pedirNumeroUsuario("Dame un número");
        int num = pedirNumeroUsuario("Dame un numero de límite");
        int numeroMultiplicar;
        int numeroLimite = num;

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
