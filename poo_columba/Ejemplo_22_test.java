package poo_columba;
/**
 *
 * @author Iván Aranda
 * @description según dos números, realizar las operaciones basicas de suma, resta, multiplicación y división.
 *              imprimir resultados (uso de set y get)
 * @date 25/Sep/2017
 */
public class Ejemplo_22_test {
    //Main
    public static void main(String args[]){
        //Instanciamiento de la clase
        Ejemplo_22 obj = new Ejemplo_22();
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
