package poo_columba;

/**
 * @author Iván Aranda
 * @description Ejercicio 4.2
 *              Se requiere calcular el volumen de un Prisma Rectangular y un Cilindro.
 *              Usar la interface llamada Figura (interface).
 * @date 01/11/2017
 */

//Implementación de la interface
public class Ejercicio_42_PR implements Ejercicio_42{
    //Atributos
    public float base, altura, largo, area, volumen;
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

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getVolumen() {
        return volumen;
    }

    public void setVolumen(float volumen) {
        this.volumen = volumen;
    }
    public float calcularArea(float b, float h){
        float a;
        a = b*h;
        return a;
    }
    public float calcularVolumen(float b, float h, float l, float a){
        float v;
        v = (2*a)*l;
        return v;
    }
    @Override
    public float calcularArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float calcularVolumen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //Main
    public static void main(String args[]){
        //Instanciar la clase
        Ejercicio_42_PR obj = new Ejercicio_42_PR();
        System.out.print("Figuras");
        System.out.print("\nPrisma Rectangular");
        System.out.print("\nBase: ");
        obj.base = CapturarVariables.capturarFlotante();
        System.out.print("\nAltura: ");
        obj.altura = CapturarVariables.capturarFlotante();
        System.out.print("\nLargo: ");
        obj.largo = CapturarVariables.capturarFlotante();
        obj.area = obj.calcularArea(obj.base, obj.altura);
        obj.volumen = obj.calcularVolumen(obj.base, obj.altura, obj.largo, obj.area);
        System.out.println("\nArea = " +obj.area+ "\nVolumen = " +obj.volumen);
    }
}
