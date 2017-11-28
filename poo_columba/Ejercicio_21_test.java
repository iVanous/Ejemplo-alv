package poo_columba;
/**
 *
 * @author Iván Aranda
 * @description Ejercicio 2.1
 *              Dado un número introducido por el usuario, calcular el factorial.
 *               
 * @date 20/Sep/2017
 */
public class Ejercicio_21_test {
    public static void main(String args[]){
        Ejercicio_21 obj = new Ejercicio_21();
        obj.num1 = Ejercicio_21.capturar();
        
        if(obj.num1 > 0){
            if(obj.num1 == 1){
                System.out.println("El factorial de 1 es 1");
            }else{
                long factorial = 1;
                int i=1;
                while(i<=obj.num1){
                    factorial = factorial * i;
                    i++;
                }
                System.out.println("El factorial de " +obj.num1+ " es " +factorial);
            }
        }else{
            System.out.println("Número incorrecto");
        }
    }
}
