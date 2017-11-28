package poo_columba;

/**
 * @author Iván Aranda
 * @description Ejemplo_4.1
 *              Se requiere calcular el área de las figuras Rectángulo y Círculo. Para la superclase llamada Figura 
 *              (clase abstratcta) y usar el constructor
                de la clase abstracta.
   @date 25/10/2017 
 */
//Subclase Rectángulo
public class Ejemplo_41_R extends Ejemplo_41{
    //Atributos
    public float base, altura;
    //Constructores
    public Ejemplo_41_R(){}
    public Ejemplo_41_R(float base, float altura){
        this.base = base;
        this.altura = altura;
    }
    //Métodos
    public float calcularArea(float b, float h){
        float a;
        a = b*h;
        return a;
    }
}
