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
    int idseguroMedico;
    boolean activo;
    String peso;
    String altura;
    String presionalterial;
    String grupo_sang;
    String indiceMasaCorporal;
    int idestudiante;
    
    public InfSalud (){}
    
    public InfSalud(int idseguroMedico, boolean activo, String peso, String altura, String presionArterial, String grupo_sang, String indiceMasaCorporal,int idestudiante) {
        this.idseguroMedico = idseguroMedico;
        this.activo = activo;
        this.peso = peso;
        this.altura = altura;
        this.presionalterial = presionArterial;
        this.grupo_sang = grupo_sang;
        this.indiceMasaCorporal = indiceMasaCorporal;
        this.idestudiante = idestudiante;
    }
    
    public int getIdseguroMedico(){
        return idseguroMedico;
    }
    
    public String getPeso(){
        return peso;
    }
    
    public String getAltura(){
        return altura;
    }
    
    public String getPresionArterial(){
        return presionalterial;
    }
    
    public String getGrupo_sang(){
        return grupo_sang;
    }
    
    public String getIndiceMasaCorporal(){
        return indiceMasaCorporal;
    }
    
    public boolean getActivo(){
        return activo;
    }
    
    public int getIdestudiante(){
        return idestudiante;
    }
    
    public void setIdseguroMedico(int idseguroMedico){
        this.idseguroMedico = idseguroMedico;
    }
    
    public void setPeso(String peso){
        this.peso = peso;
    }
    
    public void setAltura(String altura){
        this.altura = altura;
    }
    
    public void setPresionArterial(String presionArterial){
        this.presionalterial = presionArterial;
    }
    
    public void setGrupo_sang(String grupo_sang){
        this.grupo_sang = grupo_sang;
    }
    
    public void setIndiceMasaCorporal(String indiceMasaCorporal){
        this.indiceMasaCorporal = indiceMasaCorporal;
    }
    
    public void setActivo(boolean activo){
        this.activo = activo;
    }
    
    public void setIdestudiante(int idestudiante){
        this.idestudiante = idestudiante;
    }
}
