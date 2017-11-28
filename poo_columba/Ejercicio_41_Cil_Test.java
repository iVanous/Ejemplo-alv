package poo_columba;

/**
 *
 * @author Iván Aranda
 * @description Ejercicio_4.1
 *              Requerimiento: se requiere calcular el volumen de un Prisma Rectangular y un Cilindro. 
 *              Usar la superclase llamada Figura (clase abstracta) y usar el constructor de la clase abstracta.
 * @date 25/10/2017
 */
public class Ejercicio_41_Cil_Test {
    //Main
    public static void main(String args[]){
        //Instancia a la Subclase
        Ejercicio_41_Cil obj = new Ejercicio_41_Cil();
        System.out.println("Figura");
        System.out.println("\nCilindro");
        System.out.println("\nRadio: ");
        obj.radio = CapturarVariables.capturarFlotante();
        System.out.println("\nLargo: ");
        obj.largo = CapturarVariables.capturarFlotante();
        obj.area = obj.calcularArea(obj.radio);
        obj.volumen = obj.calcularVolumen(obj.area, obj.largo, obj.radio);
        System.out.println("\nFigura: Cilindro \nRadio: " +obj.radio+ "\nLargo: " +obj.largo+ "\nArea = " 
                +obj.area+ "\nVolumen = " +obj.volumen);
    }
}
