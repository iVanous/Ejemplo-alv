package poo_columba;

/**
 * @author Iván Aranda
 * @description Ejemplo_4.1
 *              Se requiere calcular el área de las figuras Rectángulo y Círculo. Para la superclase llamada Figura 
 *              (clase abstratcta) y usar el constructor
                de la clase abstracta.
   @date 25/10/2017 
 */
//Subclase Circulo 
public class Ejemplo_41_C extends Ejemplo_41{
    //Atributos
    public float radio;
    //Constructores
    public Ejemplo_41_C(){}
    public Ejemplo_41_C(float radio){
        this.radio = radio;
    }
    //Métodos
    public float calcularArea(float r){
        float a;
        a = (float) (Math.PI*r*r);
        return a;
    }
}
