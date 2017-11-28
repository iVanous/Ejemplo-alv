package poo_columba;

/**
 * @author Iván Aranda
 * @description Ejemplo_4.1
 *              Se requiere calcular el área de las figuras Rectángulo y Círculo. Para la superclase llamada Figura 
 *              (clase abstratcta) y usar el constructor
                de la clase abstracta.
   @date 25/10/2017 
 */
//Main de la Subclase Rectángulo
public class Ejemplo_41_R_Test {
    //Main
    public static void main(String args[]){
        //Instancia a la Subclase
        Ejemplo_41_R obj = new Ejemplo_41_R();
        System.out.println("Figura");
        System.out.println("\nRectángulo");
        System.out.println("\nBase: ");
        obj.base = CapturarVariables.capturarFlotante();
        System.out.println("\nAltura: ");
        obj.altura = CapturarVariables.capturarFlotante();
        obj.area = obj.calcularArea(obj.base, obj.altura);
        System.out.println("\nArea = " +obj.area);
    }
}
