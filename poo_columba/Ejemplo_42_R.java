package poo_columba;

/**
 * @author Iván Aranda
 * @description Ejemplo 4.2
 *              Se requiere calcular el área de las figuras Rectángulo y Circulo.
 *              Para la interface llamada Figura.
 * @date 01/110/2017
 */

//Implementación de la interface
public class Ejemplo_42_R implements Ejemplo_42{
    //Atributos
    public float base, altura, area;
    //Métodos
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }
    public float calcularArea(float b, float h){
        float a;
        a = b*h;
        return a;
    }
    @Override
    public float calcularArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //Main
    public static void main(String args[]){
        //Instanciar la clase
        Ejemplo_42_R obj = new Ejemplo_42_R();
        System.out.print("Figuras");
        System.out.print("\nRectángulo");
        System.out.print("\nBase: ");
        obj.base = CapturarVariables.capturarFlotante();
        System.out.print("\nAltura: ");
        obj.altura = CapturarVariables.capturarFlotante();
        obj.area = obj.calcularArea(obj.base, obj.altura);
        System.out.print("\nArea = " +obj.area);
    }
}
