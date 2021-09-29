/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author asisr
 */
public class Colegio {
    int idColegio;
    int idEstudiante;
    String privado;
    String distrital;
    Boolean activo;
    
    public Colegio() {
    }

    public Colegio(int idColegio, int idEstudiante, String privado, String distrital, Boolean activo) {
        this.idColegio = idColegio;
        this.idEstudiante = idEstudiante;
        this.privado = privado;
        this.distrital = distrital;
        this.activo = activo;
    }

    public int getIdColegio() {
        return idColegio;
    }

    public void setIdColegio(int idColegio) {
        this.idColegio = idColegio;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getPrivado() {
        return privado;
    }

    public void setPrivado(String privado) {
        this.privado = privado;
    }

    public String getDistrital() {
        return distrital;
    }

    public void setDistrital(String distrital) {
        this.distrital = distrital;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    
}
