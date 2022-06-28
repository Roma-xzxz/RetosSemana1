/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Exercise4 {

    //1.creamos la instancia de la libreria Scanner
    Scanner inputDataUser = new Scanner(System.in);
    //2, identificar las variables que necesitamos
    private int number = 0;

    public void EvenNegativeNumber() {
        System.out.println("        VALIDAR SI EL NUMERO ES PAR NEGATIVO:");
        System.out.println("           NUMERO:");
        number = inputDataUser.nextInt();
        //solicitamos el ingreso del numero si no es par negativo
        while (number >= 0 || number % 2 != 0) {
            System.out.println("ERROR. el numero no es negativo o no es par.");
            System.out.println("           NUEVO NUMERO:");
            number = inputDataUser.nextInt();
        }
        System.out.println(" El numero"+ number + " es par negatvio");
    }

}
