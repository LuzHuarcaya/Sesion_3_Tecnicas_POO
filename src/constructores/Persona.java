/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author andre
 */
public class Persona {
    private String nombre;
    private int edad;

    public Persona() {
        this.nombre= "";
        this.edad=0;
    }
    public String getTextoImprimir(){
        return "Nombre: "+ this.nombre + "\n Edad:"+getEdadComoTexto();
    }
    
    public String getEdadComoTexto(){
        String edadTexto= String.valueOf(edad);
        return edadTexto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    
    
    
    
    
}
