package Clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ecarv
 */
public class Estudiante {
    int idEstudiante;
    String primerNombre;
    String segundoNombre;
    String primerApellido;
    String segundoApellido;
    Boolean activo;

    public Estudiante() {
    }

    public Estudiante(int idEstudiante, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, Boolean activo) {
        this.idEstudiante = idEstudiante;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.activo = activo;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    
}
