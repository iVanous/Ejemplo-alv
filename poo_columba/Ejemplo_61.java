package poo_columba;

/**
 * @author Columba Martínez
 * @description Ejemplo 6.1
 *              Realizar un programa que almacene clave, nombre y apellidos de personas, 
 *              utilizar ficheros.
 */

//Superclase que implemanta la interfaz Serializable
//Superclase: Persona
public class Ejemplo_61 implements java.io.Serializable {
    //Atributos
    private String clave, nombre, apellido;
    
    //Constructor
    public Ejemplo_61(String clave, String nombre, String apellido) {
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    //Get y Set
    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    //Métodos
    public String getAtributos(){
        return this.getClave() + " " + this.getNombre() + " " + this.getApellido();
    }
}
