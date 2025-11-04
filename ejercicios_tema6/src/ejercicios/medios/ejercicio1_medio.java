package medios;

import java.util.Scanner;

public class ejercicio1_medio {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = numeroUsuario("dime cuantos numeros quieres");
        int media = 0;
        int sumaNumero = 0;

        for (int i = 0; i < numero; i++) {
            System.out.println("Introduce el valor ");
            int numeros = sc.nextInt();
            sumaNumero += numeros;
            media = sumaNumero/numero;
        }
        System.out.println("El valor de la media es " + media);
    }
    public static int numeroUsuario(String msg){

        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        int num = sc.nextInt();
        return num;
    }
}
