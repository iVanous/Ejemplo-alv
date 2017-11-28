package poo_columba;
import java.util.Scanner;

/**
 *
 * @author Iván Aranda
 * @description Ejercicio 2.2
 *              Dado un número como tope, mostrar los primos que existen entre el 1 y el número. 
 * @date 25/Sep/2017
 */
public class Ejercicio_22 {
        Scanner teclado = new Scanner(System.in);
        public int numUnidad = 1;
        public int num1;
        public boolean numPrimo;
        
        public static int capturar(){
            Scanner teclado = new Scanner(System.in);
            System.out.print("Ingresa el número: ");
            int num1;
            num1 = teclado.nextInt();
            return (num1);
        }    
}
