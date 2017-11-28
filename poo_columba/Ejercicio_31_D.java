package poo_columba;
import java.util.Scanner;

/**
 *
 * @author Iván Aranda
 * @description Ejercicio_3.1
 *                       Desarollar el programa para las clases de persona, Alumno y
 *                       Profesor del diagrama de clases del SIA
 * @date 26/10/2017
 */

//Subclase Docente
public class Ejercicio_31_D extends Ejercicio_31_P{
    //Main
    public static void main (String arg[]){
        Scanner teclado = new Scanner (System.in);
        String puesto, departamento, cubiculo, especialidad;
        //Instancia
        Ejercicio_31_D obj = new Ejercicio_31_D();        
        System.out.print("SIA");
        System.out.print("\nClave: ");
        obj.claveper = teclado.nextLine();
        if(obj.validarString(obj.claveper) == true)
            System.out.print("Datos incorrectos");
        
        System.out.print("\nNombre: ");
        obj.nombre = teclado.nextLine();
        if(obj.validarString(obj.nombre) == true)
            System.out.print("Datos incorrectos");
        
        
        System.out.print("\nCorreo: ");
        obj.correo = teclado.nextLine();
        if(obj.validarString(obj.correo) == true)
            System.out.print("Datos incorrectos");
        
        System.out.print("\nHorario: ");
        obj.horario = teclado.nextLine();
        if(obj.validarString(obj.horario) == true)
            System.out.print("Datos incorrectos");
        
        System.out.print("\nCurp: ");
        obj.curp = teclado.nextLine();
        if(obj.validarString(obj.curp) == true)
            System.out.print("Datos incorrectos");
        
        System.out.print("\nSexo: ");
        obj.sexo = teclado.nextLine();
        if(obj.validarString(obj.sexo) == true)
            System.out.print("Datos incorrectos");
        
        System.out.print("\nFecha: ");
        obj.fecha = teclado.nextLine();
        if(obj.validarString(obj.fecha) == true)
            System.out.print("Datos incorrectos");
        
        System.out.print("\nTelefono: ");
        obj.telefono = teclado.nextLine();
        if(obj.validarString(obj.telefono) == true)
            System.out.print("Datos incorrectos");
        
        System.out.print("\nDomicilio: ");
        obj.domicilio = teclado.nextLine();
        if(obj.validarString(obj.domicilio) == true)
            System.out.print("Datos incorrectos");
        
        System.out.print("\nPuesto: ");
        puesto = teclado.nextLine();
         if(obj.validarString(puesto) == true)
            System.out.print("Datos incorrectos");
         
        System.out.print("\nDepartamento: ");
        departamento = teclado.nextLine();
        if(obj.validarString(departamento) == true)
            System.out.print("Datos incorrectos");
        
        System.out.print("\nCubiculo: ");
        cubiculo = teclado.nextLine();
         if(obj.validarString(cubiculo) == true)
            System.out.print("Datos incorrectos");
         
        System.out.print("\nEspecialidad: ");
        especialidad = teclado.nextLine();
         if(obj.validarString(especialidad) == true)
            System.out.print("Datos incorrectos");
         
        System.out.print("\nClave del semestre: ");
        obj.clavesemestre = teclado.nextInt();
        if(obj.validarentero(obj.clavesemestre) == true)
            System.out.print("Datos incorrectos");
        
        //Impresion
        if (obj.validarString == false && obj.validarentero == false){
            System.out.println("\nDatos: ");
            obj.imprimir(obj.claveper, obj.nombre, obj.correo, obj.horario, obj.curp, obj.sexo, obj.fecha, obj.telefono, obj.domicilio, obj.clavesemestre);
            System.out.println("\nPuesto: " +puesto+ "\nDepartamento: " +departamento+ "\nCubiculo: " +cubiculo+ "\nEspecialidad: " 
                                       +especialidad);
        }else{
                System.out.println("Datos incorrectos");                
                        
       }
                
    }
    
}