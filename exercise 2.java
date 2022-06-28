
package practice1;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Exercise2 {
    //1. primero creamos la instancia 
    Scanner inputDataUser = new Scanner(System.in);
    //2. identificar las variables para esta clase
    private int number = 0;
    //3. creamos el metodo de validacion 
    public void EvenOrOddNumber(){
        //4.solicitamos el dato al usuario
        System.out.println("        VALIDAR SI EL NUMERO ES PAR O IMPAR:");
        System.out.println("           NUMERO:");
        number = inputDataUser.nextInt();
        //5. con el operador modular validamos si el residuo de la division
        // da igual a cero, si si es par, de lo contrario es impar. 
        if(number % 2 == 0){
            System.out.println(" El numero "+ number+" es par. ");
        }else{
            System.out.println(" El numero "+ number+" es impar. ");
        }
    }
}
