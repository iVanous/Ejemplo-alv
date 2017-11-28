package poo_columba;
/**
 *
 * @author Iván Aranda
 * @description Ejercicio 2.2
 *              Dado un número como tope, mostrar los primos que existen entre el 1 y el número. 
 * @date 25/Sep/2017
 */
public class Ejercicio_22_test {
    public static void main(String args[]){
        Ejercicio_22 obj = new Ejercicio_22();
        
        obj.num1 = Ejercicio_22.capturar();
        if(obj.num1 > 0){
            System.out.println("Número primos entre 1 y " +obj.num1+ ": ");
            for(int i=obj.numUnidad; i<=obj.num1; i++){
                obj.numPrimo = true;
                for(int j=2; j<i; j++){
                    if(i%j == 0){
                        obj.numPrimo = false;
                    }
                }
                if(obj.numPrimo){
                    System.out.println(i+ "\n");
                }
            }
        }else{
            System.out.println("Número incorrecto.");
        }
    }
}
