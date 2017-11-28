package poo_columba;

/**
 * @author ivan_
 */

//Probar las validaciones
public class Ejemplo_51_Test {
    public static void main(String args[]){
        System.out.print("Validaciones");
        System.out.print("\nEntero: ");
        int num;
        num = CapturarVariables.capturarEntero();
        if(num>-1){
            System.out.println("\nEntero capturado: " +num);
        }
    }
}
