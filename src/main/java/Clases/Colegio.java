/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/* Clase para almacenar todos los atributos
 * de la tabla colegio en la base de datos
 * de PostgreSQL para su posterior manipulación
 * y consulta dentro del sistema
 * @author asisr
 */
public class Colegio {
    int idColegio;
    String tipoColegio;
    String ciudad;
    Boolean activo;
    String nombreColegio;
    
    public Colegio() {
    }

    public Colegio(int idColegio, String tipoColegio, String ciudad, Boolean activo, String nombreColegio) {
        this.idColegio = idColegio;
        this.tipoColegio = tipoColegio;
        this.ciudad = ciudad;
        this.activo = activo;
        this.nombreColegio = nombreColegio;
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

    public String getNombreColegio() {
        return nombreColegio;
    }

    public void setNombreColegio(String nombreColegio) {
        this.nombreColegio = nombreColegio;
    }

    

}
