package poo_columba;
import java.util.Scanner;
/**
 *
 * @author Iván Aranda
 * @description Ejercicio 2.1
 *              Dado un número introducido por el usuario, calcular el factorial.
 *               
 * @date 20/Sep/2017
 */
public class Ejercicio_21 {
        public int num1;
        public long factorial;
        
        public static int capturar (){
            System.out.print("Ingresa el número: ");
            Scanner teclado = new Scanner(System.in);
            int num1;
            num1 = teclado.nextInt();
            return (num1);
        }
}
