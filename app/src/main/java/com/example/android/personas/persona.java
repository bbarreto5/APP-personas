package com.example.android.personas;

/**
 * Created by android on 09/04/2018.
 */

public class persona {
    private String nombre;
    private String cedula;
    private String apellido;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public persona(String nombre, String cedula, String apellido) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.apellido = apellido;
    }

    public void guardar(){
        datos.guardar(this);
    }

}
