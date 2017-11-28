package poo_columba;

/**
 * @author Iván Aranda
 * @description Ejercicio 5.1
 *              Requerimiento: validar entradas de datos de tipo float, double y String.
 */

//Probar las validaciones 
public class Ejercicio_51 {
    public static void main(String args[]){
        System.out.print("Validaciones");
        
        //float
        System.out.print("\nFloat: ");
        float num1;
        num1 = CapturarVariables.capturarFlotante();
        if(num1>-1){
            System.out.println("\nFloat capturado: " +num1);
        }
        
        //double
        System.out.print("\nDouble: ");
        double num2;
        num2 = CapturarVariables.capuradouble();
        if(num2>-1){
            System.out.println("\nDouble capturado: " +num2);
        }
        
        //String
        System.out.print("\nString: ");
        String texto;
        texto = CapturarVariables.capturasting();
        if(!texto.isEmpty()){
            System.out.println("\nString capturado: " +texto);
        }else{
            System.out.println("\nString vacio.");
        }
    }
}
