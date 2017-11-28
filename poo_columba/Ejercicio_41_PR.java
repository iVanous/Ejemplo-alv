package poo_columba;

/**
 *
 * @author Iván Aranda
 * @description Ejercicio_4.1
 *              Requerimiento: se requiere calcular el volumen de un Prisma Rectangular y un Cilindro. 
 *              Usar la superclase llamada Figura (clase abstracta) y usar el constructor de la clase abstracta.
 * @date 25/10/2017
 */
//Subclase Prisma Rectangular 
public class Ejercicio_41_PR extends Ejemplo_41{
    //Atributos
    public float base, altura, largo;
    //Constructores
    public Ejercicio_41_PR(){}
    public Ejercicio_41_PR(float base, float altura, float largo){
        this.base = base;
        this.altura = altura;
        this.largo = largo;
    }
    //Métodos
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
}
