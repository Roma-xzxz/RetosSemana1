package practice1;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Exercise3 {

    //1.creamos la instancia de la libreria Scanner
    Scanner inputDataUser = new Scanner(System.in);
    //2, identificar las variables que necesitamos
    private int number = 0;
    //3. creamos el metodo de validacion 

    public void EvenOrOddNegativeNumber() {
        //4.solicitamos el dato al usuario
        System.out.println("        VALIDAR SI EL NUMERO  NEGATIVO ES PAR O IMPAR:");
        System.out.println("           NUMERO:");
        number = inputDataUser.nextInt();
        //5. primero validamos en una condicional superior si es negativo o no
        // dentro de esta condicional, validamos si es numero par o impar.
        if (number < 0) {
            if (number % 2 == 0) {
                System.out.println(" El numero " + number + " Es negativo par. ");
            } else {
                System.out.println(" El numero " + number + " Es negativo impar. ");
            }
        } else {
            System.out.println("Error. no cumple la restriccion de ser negativo. ");
        }

    }
}
