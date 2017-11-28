package poo_columba;

/**
 * @author Iván Aranda
 * @description Ejemplo_4.1
 *              Se requiere calcular el área de las figuras Rectángulo y Círculo. Para la superclase llamada Figura 
 *              (clase abstratcta) y usar el constructor
                de la clase abstracta.
   @date 25/10/2017 
 */
public class Ejemplo_41_C_Test {
    //Main
    public static void main(String args[]){
        //Instancia de la Subclase
        Ejemplo_41_C obj = new Ejemplo_41_C();
        System.out.println("Figura");
        System.out.println("\nCirculo");
        System.out.println("\nRadio: ");
        obj.radio = CapturarVariables.capturarFlotante();
        obj.area = obj.calcularArea(obj.radio);
        System.out.println("\nArea = " +obj.area);
    }
}
