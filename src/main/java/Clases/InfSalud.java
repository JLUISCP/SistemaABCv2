/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 * Clase para la entidad InfSalud.
 * Encargada del manejo de la información dentro de la entidad.
 * @author Emilio Antonio Alarcón Santos
 * @version 1.0.0
 */
public class InfSalud {
    int idinf_salud;
    String eps;
    String ips;
    String ars;
    String grupo_sang;
    String sisben;
    int idestudiante;
    
    public InfSalud (){}
    
    public InfSalud(int idinf_salud, String eps, String ips, String ars, String grupo_sang, String sisben, int idestudiante) {
        this.idinf_salud = idinf_salud;
        this.eps = eps;
        this.ips = ips;
        this.ars = ars;
        this.grupo_sang = grupo_sang;
        this.sisben = sisben;
        this.idestudiante = idestudiante;
    }
    
    public int getIdinf_salud(){
        return idinf_salud;
    }
    
    public String getEps(){
        return eps;
    }
    
    public String getIps(){
        return ips;
    }
    
    public String getArs(){
        return ars;
    }
    
    public String getGrupo_sang(){
        return grupo_sang;
    }
    
    public String getSisben(){
        return sisben;
    }
    
    public int getIdestudiante(){
        return idestudiante;
    }
    
    public void setIdinf_salud(int idinf_salud){
        this.idinf_salud = idinf_salud;
    }
    
    public void setEps(String eps){
        this.eps = eps;
    }
    
    public void setIps(String ips){
        this.ips = ips;
    }
    
    public void setArs(String ars){
        this.ars = ars;
    }
    
    public void setGrupo_sang(String grupo_sang){
        this.grupo_sang = grupo_sang;
    }
    
    public void setSisben(String sisben){
        this.sisben = sisben;
    }
    
    public void setIdestudiante(int idestudiante){
        this.idestudiante = idestudiante;
    }
}
