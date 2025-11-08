package ejercicios_tema6.src.ejercicios.altos;

import java.util.Scanner;

public class ejercicio1_alto {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int numero = pedirNumeroUsuario("Dame un numero");
        int suma = 0;
        int contador = 0;

        while (numero != 0) {
            suma += numero;
            contador++;
            numero = pedirNumeroUsuario("Dame otro número (con el 0 se termina)");
        }
        if (contador > 0){
            double media = (double) suma / contador;
            System.out.println("Suma es " + suma + " | Media: " + media);
        }else {
            System.out.println("No has introducido níngun número");

        }
    }

    private static int pedirNumeroUsuario(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        int numero = sc.nextInt();
        return numero;
    }
}
