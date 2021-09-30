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
    String tipoColegio;
    String ciudad;
    Boolean activo;
    
    public Colegio() {
    }

    public Colegio(int idColegio, int idEstudiante, String tipoColegio, String ciudad, Boolean activo) {
        this.idColegio = idColegio;
        this.tipoColegio = tipoColegio;
        this.ciudad = ciudad;
        this.activo = activo;
    }

    public int getIdColegio() {
        return idColegio;
    }

    public void setIdColegio(int idColegio) {
        this.idColegio = idColegio;
    }

    public String getTipoColegio() {
        return tipoColegio;
    }

    public void setTipoColegio(String tipoColegio) {
        this.tipoColegio = tipoColegio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

}
