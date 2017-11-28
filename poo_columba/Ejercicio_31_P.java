package poo_columba;

/**
 *
 * @author Iván Aranda 
 * @description Ejercicio_3.1
 *                       Desarollar el programa para las clases de persona, Alumno y
 *                       Profesor del diagrama de clases del SIA.
 * @date 26/10/2017
 */

//Superclase 
public class Ejercicio_31_P {
    //Atributos
    public String claveper, nombre, correo, horario, curp, sexo,fecha, telefono, domicilio;  
    public int clavesemestre;
    public boolean validarentero, validarString;
          
    //Métodos
    //Get
    public String getClaveper() {
        return claveper;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getHorario() {
        return horario;
    }

    public String getCurp() {
        return curp;
    }

    public String getSexo() {
        return sexo;
    }

    public String getFecha() {
        return fecha;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public int getClavesemestre() {
        return clavesemestre;
    }   
    //Set
    public void setClaveper(String claveper) {
        this.claveper = claveper;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setClavesemestre(int clavesemestre) {
        this.clavesemestre = clavesemestre;
    }
    
    //Validacion
    public boolean validarString(String string){
        boolean correcto;
        System.out.print("Variable: " +string);
        if(string!=null){
            correcto = false;
            
        }else{
            correcto = true;
        }
        return correcto;
    }
    
    public boolean validarentero(int entero){
        boolean correcto;
        if(entero!=0){
            correcto = false;
        }else{
            correcto = true;
        }
        return correcto;
    }          
    
    public void imprimir (String clavepe, String nombr, String fech, String corre, String horari, String cur
                                        ,String sex, String telefon, String domicili, int clavesemestr){
                         System.out.print("Clave: " + claveper + "\nNombre: " + nombre + "\nCorreo: " + correo + "\nHorario(folio): " + horario +
                                        "\nCurp: " + curp + "\nSexo: " + sexo + "\nFecha: " + fecha + "\nTelfono: "+ telefono + "\nDomicilio: " +
                                        domicilio + "\nClavesemestre: " + clavesemestre);
    }   
    
}
