/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1;
//1.importar libreria scanner

import java.util.Scanner;

public class Exercise1 {
    //2.crear la instancia de la libreria scanner 

    Scanner inputDataUser = new Scanner(System.in);
    //3.identificar las variables necesarias de la clase 
    private String userName = "";
    private char gender = 'F';
    private int age = 0;

    public void RequestDataUser() {
        System.out.println("        DATOS PERSONALES");
        System.out.println("           Nombre:");
        userName = inputDataUser.nextLine();
        System.out.println("           Edad:");
        age = inputDataUser.nextInt();
        System.out.println("           Genero:\n           F. femenino\n           M. masculino\n           O. otro ");
        gender = inputDataUser.next().charAt(0);
        //4. validacion de entradas por parte del ususario
        if (age >= 18) {
            switch (gender) {
                case 'F':
                case 'f':
                    System.out.println(userName + " de genero femenino es mayor de edad");
                    break;
                case 'M':
                case 'm':
                    System.out.println(userName + " de genero masculino es mayor de edad");
                    break;
                case 'O':
                case 'o':
                    System.out.println(userName + " de  otro tipo de genero es mayor de edad");
                    break;
                default:
                    System.out.println("Error. El genero ingresado no existe en la lista");
                    break;
            }
        } else {

            switch (gender) {
                case 'F':
                case 'f':
                    System.out.println(userName + " de genero femenino es menor de edad");
                    break;
                case 'M':
                case 'm':
                    System.out.println(userName + " de genero masculino es menor de edad");
                    break;
                case 'O':
                case 'o':
                    System.out.println(userName + " de  otro tipo de genero es menor de edad");
                    break;
                default:
                    System.out.println("Error. El genero ingresado no existe en la lista");
                    break;  
            }
        }

    }
    
}
