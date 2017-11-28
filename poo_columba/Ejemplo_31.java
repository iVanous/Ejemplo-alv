package poo_columba;
/**
 *
 * @author Iván Aranda
 * @description Ejemplo 3.1
 *              Se requiere clacular las areas de las figuras Rectángulo y Triangulo
 *              Para la superclase llamada Figura se tiene solamente
 *              el método de calcular área (b*h)
 */
//SuperClase Figura
public class Ejemplo_31 {
    //Atributos
    public float base, altura, area;
    //Métodos
    //Get
    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public float getArea() {
        return area;
    }
    //Set
    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setArea(float area) {
        this.area = area;
    }
    
    //Calcular área
    public float calcularArea (float b, float h){
        float a;
        a = b*h;
        return (a);
    }
    //Imprimir area
    public void imprimirArea (float a){
        System.out.println(a);
    }
}
