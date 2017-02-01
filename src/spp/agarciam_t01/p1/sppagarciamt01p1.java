/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.agarciam_t01.p1;
import java.util.Scanner;

/**
 *
 * @author alejandromonroy
 */
public class sppagarciamt01p1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int X1,X2,Y1,Y2;
        double D;
        // A1, A2, B1, B2 = COORDENADAS, D= DISTANCIA
        Scanner kb= new Scanner (System.in);
        
        System.out.println("Escribe el valor de X1");
        X1 = (int) kb.nextDouble();
        System.out.println("Escribe el valor de X2");
        X2 = (int) kb.nextDouble();
        System.out.println("Escribe el valor de Y1");
        Y1 = (int) kb.nextDouble();
        System.out.println("Escribe el valor de Y2");
        Y2 = (int) kb.nextDouble();
        
        D = Math.sqrt (Math.pow((X1-X2),2) + Math.pow((Y1-Y2),2));
        System.out.println("La distancia entre los puntos es: " + D);
       
        
    }
    
}
