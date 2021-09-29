package Clases;

public class Acudiente {
    int idacudiente;
    int ident_madre;
    int ident_padre;
    String nom_madre;
    String nom_padre;
    String direc_elect;
    int idestudiante;
    boolean activo;

    public Acudiente(int idacudiente, int ident_madre, int ident_padre, String nom_madre, String nom_padre, String direc_elect, int idestudiante, boolean activo) {
        this.idacudiente = idacudiente;
        this.ident_madre = ident_madre;
        this.ident_padre = ident_padre;
        this.nom_madre = nom_madre;
        this.nom_padre = nom_padre;
        this.direc_elect = direc_elect;
        this.idestudiante = idestudiante;
        this.activo = activo;
    }

    public int getIdacudiente() {
        return idacudiente;
    }

    public void setIdacudiente(int idacudiente) {
        this.idacudiente = idacudiente;
    }

    public int getIdent_madre() {
        return ident_madre;
    }

    public void setIdent_madre(int ident_madre) {
        this.ident_madre = ident_madre;
    }

    public int getIdent_padre() {
        return ident_padre;
    }

    public void setIdent_padre(int ident_padre) {
        this.ident_padre = ident_padre;
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
}
