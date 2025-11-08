package ejercicios_tema6.src.ejercicios.altos;

import java.util.Scanner;

public class ejercicio2_alto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = pedirNumeroUsuario(sc, "Dame un número (0 para salir)");
        int mayor = 0;
        int menor = 0;
        boolean primerNumero = true;

        while (numero != 0) {

            if (primerNumero) {
                mayor = numero;
                menor = numero;
                primerNumero = false;
            } else {
                if (numero > mayor) {
                    mayor = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
            }

            // Pedir el siguiente número siempre al final del bucle
            numero = pedirNumeroUsuario(sc, "Dame otro número (0 para salir)");
        }

        // Mostrar resultados después de salir del bucle
        if (!primerNumero) {
            System.out.println("El número mayor es " + mayor);
            System.out.println("El número menor es " + menor);
        } else {
            System.out.println("No has introducido ningún número.");
        }

        sc.close(); // cerrar Scanner al final
    }

    private static int pedirNumeroUsuario(Scanner sc, String msg) {
        System.out.println(msg);
        return sc.nextInt();
    }
}

