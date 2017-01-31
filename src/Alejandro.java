
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alejandromonroy
 */
public class Alejandro {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A1,A2,B1,B2;
        double D;
        // A1, A2, B1, B2 = COORDENADAS, D= DISTANCIA
        Scanner T= new Scanner (System.in);
        
        System.out.println("Escribe el valor de A1");
        A1 = (int) T.nextDouble();
        System.out.println("Escribe el valor de A2");
        A2 = (int) T.nextDouble();
        System.out.println("Escribe el valor de B1");
        B1 = (int) T.nextDouble();
        System.out.println("Escribe el valor de B2");
        B2 = (int) T.nextDouble();
        
        D = Math.sqrt (Math.pow((A1-A2),2) + Math.pow((B1-B2),2));
        System.out.println("La distancia entre los puntos es: " + D);
    
}
