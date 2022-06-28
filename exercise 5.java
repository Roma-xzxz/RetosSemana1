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
public class Exercise5 {
    //1.creamos la instancia de la libreria Scanner

    Scanner inputDataUser = new Scanner(System.in);
    //2. identificar las variables que necesitamos
    private String wifiPassword = "";
    private int numberAttempts = 1;

    //3. creamos el metodo de validacion
    public void ValidateWifiPassword() {
        System.out.println("        VALIDAR PASSWORD WIFI:");
        //4. solicitud y captura del valor ingresado
        //la primer solicitud de la password del wifi, no cuenta entre los 3
        //intentos, por esta razon el condicional del while va hasta menor que 3
        System.out.println("           PASSWORD:");
        wifiPassword = inputDataUser.nextLine();
        //5. validar si la password ingresada es igual a "ABC123"
        //para validar si una cadena de texto es igual a otra no se debe 
        //utilizar doble igual
        while (numberAttempts < 3) {
            if (wifiPassword.equals("ABC123")) {
                System.out.println("conectado a la red wifi");
            } else {
                System.out.println("password incorrecta, Funcion equals()");
                wifiPassword = inputDataUser.nextLine();
            }
            numberAttempts += 1;

        }
    }
