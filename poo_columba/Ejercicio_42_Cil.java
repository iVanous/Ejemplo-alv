package poo_columba;

/**
 * @author Iván Aranda
 * @description Ejercicio 4.2
 *              Se requiere calcular el volumen de un Prisma Rectangular y un Cilindro.
 *              Usar la interface llamada Figura (interface).
 * @date 01/11/2017
 */

//Implemetanción de la interface 
public class Ejercicio_42_Cil implements Ejercicio_42{
    //Atributos
    public float radio, largo, area, volumen;
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

    public float getVolumen() {
        return volumen;
    }

    public void setVolumen(float volumen) {
        this.volumen = volumen;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }
    public float calcularArea(float r){
        float a;
        a = (float) (Math.PI*r*r);
        return a;
    }
    public float calcularVolumen(float r, float l, float a){
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
        Ejercicio_42_Cil obj = new Ejercicio_42_Cil();
        System.out.print("Figuras");
        System.out.print("\nCilindro");
        System.out.print("\nRadio: ");
        obj.radio = CapturarVariables.capturarFlotante();
        System.out.println("\nLargo: ");
        obj.largo = CapturarVariables.capturarFlotante();
        obj.area = obj.calcularArea(obj.radio);
        obj.volumen = obj.calcularVolumen(obj.radio, obj.largo, obj.area);
        System.out.println("\nArea = " +obj.area+ "\nVolumen = " +obj.volumen);
    }

    
    
    
}
