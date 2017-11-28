package poo_columba;

/**
 *
 * @author Iván Aranda
 * @description Ejemplo 3.1
 *              Se requiere clacular las areas de las figuras Rectángulo y Triángulo
 *              Para la superclase llamada Figura se tiene solamente
 *              el método de calcular área (b*h) y los atributos de 
 */
//SubClase Triángulo
public class Ejemplo_31_T extends Ejemplo_31{
    public static void main(String args[]){
        //Instancia
        Ejemplo_31_T obj = new Ejemplo_31_T();
        System.out.print("Figura");
        System.out.print("\nTriangulo");
        System.out.print("\nBase: ");
        obj.base = CapturarVariables.capturarFlotante();
        System.out.print("\nAltura: ");
        obj.altura = CapturarVariables.capturarFlotante();
        obj.area = obj.calcularArea(obj.base, obj.altura);
        obj.area = obj.area/2;
        System.out.print("\nArea: ");
        obj.imprimirArea(obj.area);
    }
}
