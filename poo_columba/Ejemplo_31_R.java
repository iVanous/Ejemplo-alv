package poo_columba;

/**
 *
 * @author Iván Aranda
 * @description Ejemplo 3.1
 *              Se requiere clacular las areas de las figuras Rectángulo y Triángulo
 *              Para la superclase llamada Figura se tiene solamente
 *              el método de calcular área (b*h) y los atributos de 
 */
//SubClase Rectángulo
public class Ejemplo_31_R extends Ejemplo_31{
    public static void main(String args[]){
        //Instancia
        Ejemplo_31_R obj = new Ejemplo_31_R();
        System.out.print("Figura");
        System.out.print("\nRectángulo");
        System.out.print("\nBase: ");
        obj.base = CapturarVariables.capturarFlotante();
        System.out.print("\nAltura: ");
        obj.altura = CapturarVariables.capturarFlotante();
        obj.area = obj.calcularArea(obj.base, obj.altura);
        System.out.print("\nArea: ");
        obj.imprimirArea(obj.area);
    }
}
