package Clases;

public class Acudiente {
    int idacudiente;
    String nom_madre;
    String nom_padre;
    String direc_elect;
    String telefono1;
    String telefono2;        
    int idestudiante;
    boolean activo;
    
    public Acudiente(){
    }

    public Acudiente(int idacudiente, String telefono1, String telefono2, String nom_madre, String nom_padre, String direc_elect, int idestudiante, boolean activo) {
        this.idacudiente = idacudiente;
        this.nom_madre = nom_madre;
        this.nom_padre = nom_padre;
        this.direc_elect = direc_elect;
        this.idestudiante = idestudiante;
        this.activo = activo;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
    }

    public int getIdacudiente() {
        return idacudiente;
    }

    public void setIdacudiente(int idacudiente) {
        this.idacudiente = idacudiente;
    }

    public String getNom_madre() {
        return nom_madre;
    }

    public void setNom_madre(String nom_madre) {
        this.nom_madre = nom_madre;
    }

    public String getNom_padre() {
        return nom_padre;
    }

    public void setNom_padre(String nom_padre) {
        this.nom_padre = nom_padre;
    }

    public String getDirec_elect() {
        return direc_elect;
    }

    public void setDirec_elect(String direc_elect) {
        this.direc_elect = direc_elect;
    }

    public int getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(int idestudiante) {
        this.idestudiante = idestudiante;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    public void setTelefono1(String telefono1){
        this.telefono1 = telefono1;
    }
    
    public String getTelefono1(){
        return telefono1;
    }
    
    public void setTelefono2(String telefono2){
        this.telefono2 = telefono2;
    }
    
    public String getTelefono2(){
        return telefono2;
    }
    
}
