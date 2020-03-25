
package u06e05;

import java.util.Scanner;

public class U06E05 {
   
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int n, i, h;
        System.out.print("Ingrese el tamaño del array: ");
        n = entrada.nextInt();
        String[] nombres = new String[n];
        entrada.nextLine();
        for (i=0; i<nombres.length; i++){
            System.out.print("Ingrese el nombre "+(i+1)+": ");
            nombres[i]=entrada.nextLine();
        }
        System.out.print("\n");
        for (h=0; h<nombres.length; h++){
            System.out.println(nombres[h]);
        }
    }
}