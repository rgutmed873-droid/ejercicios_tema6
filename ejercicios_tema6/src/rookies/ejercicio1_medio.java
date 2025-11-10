package ejercicios_tema6.src.rookies;

import java.util.Scanner;

public class ejercicio1_medio {
    static void main(String[] args) {

        int numero = numeroUsuario("Dame un número");

        boolean esPrimo = true;

        if (numero <=1){
            esPrimo = false;
        }else {
            int i = 2;
            while (i <= Math.sqrt(numero)) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
            i++;
            }
        }
        if(esPrimo){
            System.out.println(numero + " es un número primo ");
        }else {
            System.out.println(numero + " es un número compuesto ");
        }

    }

    private static int numeroUsuario (String msg){
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        int num = sc.nextInt();
        return num;
    }

}
