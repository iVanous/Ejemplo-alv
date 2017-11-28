package poo_columba;
import java.io.*;

/**
 *
 * @author Iván Aranda
 * @description Ejercicio 6.1
 *              Realizar un programa que almacene datos en un fichero de texto.
 * @date 24/11/2017
 */

public class Ejercicio_61 {
        public void escribir(String a){
        //Creación del archivo de texto
        File archivo;
        archivo = new File("K:/archivo2.txt");
        try{
            //Escritura en el archivo de texto
            FileWriter escritura = new FileWriter(archivo);
            BufferedWriter espacioMemoria = new BufferedWriter(escritura);
            PrintWriter laImpresion = new PrintWriter(espacioMemoria);
            //Impresión en el archivo de texto
            laImpresion.write("Ejemplo: Usar datos en un archivo de texto ");
            laImpresion.write("--------------- Autor intelectual y desarrollador: ");
            laImpresion.append(" Iván Aranda :v");
            laImpresion.close();
            espacioMemoria.close();
            
            if(archivo.createNewFile()){
                System.out.println("Archivo creado");
            }
        }catch(IOException e){
            System.err.println("Archivo no creado " +e);
        }
    }
}
