package poo_columba;

/**
 * @author Iván Aranda
 * @description Ejemplo 4.2
 *              Se requiere calcular el área de las figuras Rectángulo y Circulo.
 *              Para la interface llamada Figura.
 * @date 01/110/2017
 */

//Implementación de la interface
public class Ejemplo_42_C implements Ejemplo_42{
    //Atributos
    public float radio, area;
    
    //Métodos
    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }
    public float calcularArea(float r){
        float a;
        a = (float) (Math.PI*r*r);
        return a;
    }
    @Override
    public float calcularArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //Main
    public static void main(String args[]){
        //Instanciar la clase
        Ejemplo_42_C obj = new Ejemplo_42_C();
        System.out.print("Figuras");
        System.out.print("\nCirculo");
        System.out.print("\nRadio: ");
        obj.radio = CapturarVariables.capturarFlotante();
        obj.area = obj.calcularArea(obj.radio);
        System.out.println("\nArea = " +obj.area);
    }
}
