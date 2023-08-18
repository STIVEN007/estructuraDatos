
package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int[] A = new int[10]; 
        int[] B = new int[10]; 
        int producto = 0; 
        
        System.out.println("Ingrese los elementos del arreglo A:");
        for (int i = 0; i < 10; i++) {
            A[i] = sc.nextInt(); 
        }
        
        System.out.println("Ingrese los elementos del arreglo B:");
        for (int i = 0; i < 10; i++) {
            B[i] = sc.nextInt(); 
        }
        
        for (int i = 0; i < 10; i++) {
            producto += A[i] * B[i]; 
        }
        
        System.out.println("El producto escalar de los dos vectores es: " + producto);
         System.out.println("jajajajjaj");
    }
    
}
