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
public class HistoriaAcademica {
    int idhistorial_academico;
    int idestudiante;
    String colegio_anterior;
    String año;
    String grado;
    Boolean activo;

    public HistoriaAcademica() {
    }

    public HistoriaAcademica(int idhistorial_academico, int idestudiante, String colegio_anterior, String año, String grado, Boolean activo) {
        this.idhistorial_academico = idhistorial_academico;
        this.idestudiante = idestudiante;
        this.colegio_anterior = colegio_anterior;
        this.año = año;
        this.grado = grado;
        this.activo = activo;
    }

    public int getIdhistorial_academico() {
        return idhistorial_academico;
    }

    public void setIdhistorial_academico(int idhistorial_academico) {
        this.idhistorial_academico = idhistorial_academico;
    }

    public int getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(int idestudiante) {
        this.idestudiante = idestudiante;
    }

    public String getColegio_Anterior() {
        return colegio_anterior;
    }

    public void setColegio_Anterior(String colegio_anterior) {
        this.colegio_anterior = colegio_anterior;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    
}


