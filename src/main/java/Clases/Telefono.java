package Clases;

/**
 * @autor djov
 */
public class Telefono {
    int idtelefono;
    String fijo;
    String celular;
    boolean activo;

    public Telefono(int idtelefono, String fijo, String celular, boolean activo) {
        this.idtelefono = idtelefono;
        this.fijo = fijo;
        this.celular = celular;
        this.activo = activo;
    }

    public Telefono() {
    }

    public int getIdtelefono() {
        return idtelefono;
    }

    public void setIdtelefono(int idtelefono) {
        this.idtelefono = idtelefono;
    }

    public String getFijo() {
        return fijo;
    }

    public void setFijo(String fijo) {
        this.fijo = fijo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
