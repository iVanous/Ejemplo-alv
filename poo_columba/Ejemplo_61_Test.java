package poo_columba;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author Columba Martínez
 * @description Ejemplo 6.1
 *              Realizar un programa que almacene clave, nombre y apellidos de personas, 
 *              utilizar ficheros.
 */

//Subclase que escribe y lee archivos binarios y usa la Superclase Persona (Ejemplo_61)
public class Ejemplo_61_Test {
    //Main
    public static void main (String arg[]){
        //Escribe un objeto en la clase Persona, en un fichero de texto binario
        //crea el archivo (ruta, nombre y extensión)
        String nombreFichero = "Ejemplo61.dat";
        //crea la instancia a la clase para escribir el fichero
        try {
            FileOutputStream ficheroSalida = new FileOutputStream(nombreFichero);
            try (ObjectOutputStream objetoSalida = new ObjectOutputStream (ficheroSalida)) {
                objetoSalida.writeObject(new Ejemplo_61("01","Columba","Martinez"));
            }
        } catch (FileNotFoundException e){
            System.out.print("Archivo no existe");
        } catch (IOException e) {
            System.out.print(e.getMessage());
        } catch (Exception e){
            System.out.print(e.getMessage());
        }
        
        //Lee el objeto que se escribió en el fichero
        try {
            FileInputStream ficheroEntrada = new FileInputStream (nombreFichero);
            Ejemplo_61 obj;
            try (ObjectInputStream objetoEntrada = new ObjectInputStream (ficheroEntrada)) {
                obj = (Ejemplo_61) objetoEntrada.readObject();
            }
            System.out.print(obj.getAtributos());
        } catch (FileNotFoundException e) {
            System.out.print("Archivo no existe");
        } catch (IOException | ClassNotFoundException e) {
            System.out.print(e.getMessage());
        }
    }
}
