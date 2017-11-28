package poo_columba;

/**
 *
 * @author Iván Aranda
 * @description Ejemplo 1.1c
 *              Según dos números, realizar las operaciones basicas de suma, resta, multiplicación y división
 *              imprimir resultados 
 * @date 13/Sep/2017
 */

//Clase
public class Ejemplo_11c {
    //Atributos
    //entrada
    public float num1, num2;
    //salida
    public float suma, resta, multiplicacion, division;
    //Métodos
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
