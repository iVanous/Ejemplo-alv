package poo_columba;

/**
 *
 * @author Iván Aranda
 * @description Ejercicio_4.1
 *              Requerimiento: se requiere calcular el volumen de un Prisma Rectangular y un Cilindro. 
 *              Usar la superclase llamada Figura (clase abstracta) y usar el constructor de la clase abstracta.
 * @date 25/10/2017
 */
public class Ejercicio_41_PR_Test {
    //Main
    public static void main(String args[]){
        //Instancia a la Subclase
        Ejercicio_41_PR obj = new Ejercicio_41_PR();
        System.out.println("Figura");
        System.out.println("\nPrisma Rectangular");
        System.out.println("\nBase: ");
        obj.base = CapturarVariables.capturarFlotante();
        System.out.println("\nAltura: ");
        obj.altura = CapturarVariables.capturarFlotante();
        System.out.println("\nLargo: ");
        obj.largo = CapturarVariables.capturarFlotante();
        obj.area = obj.calcularArea(obj.base, obj.altura);
        obj.volumen = obj.calcularVolumen(obj.base, obj.altura, obj.largo, obj.area);
        System.out.println("\nFigura: Prisma Rectangular \nBase: " +obj.base+ "\nAltura: " +obj.altura+ "\nLargo: " +obj.largo+
                            "\nArea = " +obj.area+ "\nVolumen = " +obj.volumen);
    }
}
