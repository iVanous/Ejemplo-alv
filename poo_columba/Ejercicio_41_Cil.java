package poo_columba;

/**
 *
 * @author Iván Aranda
 * @description Ejercicio_4.1
 *              Requerimiento: se requiere calcular el volumen de un Prisma Rectangular y un Cilindro. 
 *              Usar la superclase llamada Figura (clase abstracta) y usar el constructor de la clase abstracta.
 * @date 25/10/2017
 */
public class Ejercicio_41_Cil extends Ejemplo_41{
    //Atributos
    public float radio, largo;
    //Constructores
    public Ejercicio_41_Cil(){}
    public Ejercicio_41_Cil(float radio){
        this.radio = radio;
    }
    //Métodos
    public float calcularArea(float r){
        float a;
        a = (float) (Math.PI*r*r);
        return a;
    }
    public float calcularVolumen(float r, float a, float l){
        float v;
        v = (2*a)*l;
        return v;
    }
}
