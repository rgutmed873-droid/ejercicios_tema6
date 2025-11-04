package ejercicios.iniciales;

import java.util.Scanner;

public class ejercicio2_inicial {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroAEvaluar = pedirNumeroUsuario("Dime los números que vas a introducir");
        int suma = 0;
        for (int i = 1; i <= numeroAEvaluar; i++) {
            System.out.println("Introduce el número " + i);
            int num = sc.nextInt();
            if(num>10){
                suma = suma + num;

            }
        }
        System.out.println("El resultado es" + suma);
    }
    public static int pedirNumeroUsuario(String msg) {

        Scanner sc = new Scanner(System.in);
        System.out.println(msg);

        int numeroUsuario = sc.nextInt();

        return numeroUsuario;
    }
}
