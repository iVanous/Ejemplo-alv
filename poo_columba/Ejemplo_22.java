package poo_columba;
/**
 *
 * @author Iván Aranda
 * @description según dos números, realizar las operaciones basicas de suma, resta, multiplicación y división.
 *              imprimir resultados (uso de set y get)
 * @date 25/Sep/2017
 */
public class Ejemplo_22 {
    //Atributos
    //Entrada
     public float num1, num2;
     //Salida
     public float suma, resta, multiplicacion, division;
     //Metodos
     //get
     public float gatnum1() {return num1;}
     public float gatnum2() {return num2;}
     public float gatsuma() {return suma;}
     public float gatresta() {return resta;}
     public float gatmultiplicacion() {return multiplicacion;}
     public float gatdividision() {return division;}
     //set
     public void setnum1(float num1) {this.num1=num1;}
     public void setnum2(float num2) {this.num2=num2;}
     public void setsuma(float suma) {this.suma=suma;}
     public void setresta(float resta) {this.resta=resta;}
     public void setmultiplicacion(float multiplicacion) {this.multiplicacion=multiplicacion;}
     public void setdivision(float division) {this.division=division;}
     //validar
    public boolean validar (float n2){
        boolean correcto;
        if(n2 != 0){
            correcto = true;
        }
        else{
            correcto = false;
        }
        return correcto;
    }
    //sumar
    public float sumar (float n1, float n2){
        float res;
        res = n1 + n2;
        return res;
    }
    //restar
    public float restar (float n1, float n2){
        float res;
        res = n1 - n2;
        return res;
    }
    //multiplicar
    public float multiplicar (float n1, float n2){
        float res;
        res = n1 * n2;
        return res;
    }
    //dividir
    public float dividir (float n1, float n2){
        float res;
        res = n1 / n2;
        return res;
    }
    public void imprimir (float r){
        System.out.println(r);
    }
}
