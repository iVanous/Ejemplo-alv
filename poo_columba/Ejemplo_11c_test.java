package poo_columba;

/**
 *
 * @author Iván Aranda
 * @description Ejemplo 1.1c
 *              Según dos números, realizar las operaciones basicas de suma, resta, multiplicación y división
 *              imprimir resultados 
 * @date 13/Sep/2017
 */
//Clase de prueba
public class Ejemplo_11c_test {
    //Main
    public static void main(String args[]){
        //Instanciamiento de la clase
        Ejemplo_11c obj = new Ejemplo_11c();
        //Requerimiento
        System.out.print("OPERACIONES BASICAS");
        //Capturar
        System.out.print("\nIngresar número 1: ");
        obj.num1 = CapturarVariables.capturarFlotante();
        System.out.print("Ingresar número 2: ");
        obj.num2 = CapturarVariables.capturarFlotante();
        //Validar
        boolean validacion;
        validacion = obj.validar(obj.num2); 
        if (validacion == false){
            System.out.println("\nNúmero incorrecto");
        }else{
            obj.suma = obj.sumar(obj.num1, obj.num2);
            obj.resta = obj.restar(obj.num1, obj.num2);
            obj.multiplicacion = obj.multiplicar(obj.num1, obj.num2);
            obj.division = obj.dividir(obj.num1, obj.num2);
            System.out.println("\nResultados");
            System.out.println("\nSuma: ");
            obj.imprimir(obj.suma);
            System.out.println("\nResta: ");
            obj.imprimir(obj.resta);
            System.out.println("\nMultiplicación: ");
            obj.imprimir(obj.multiplicacion);
            System.out.println("\nDivisión: ");
            obj.imprimir(obj.division);
        }
    }
}
