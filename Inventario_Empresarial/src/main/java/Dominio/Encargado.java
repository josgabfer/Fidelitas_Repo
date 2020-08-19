package Dominio;

public class Encargado {
    private int id_encargado;
    private String nombre_usuario;
    private String nombre;
    private String apellido_1;
    private String correo_1;
    private String numero_1;

    public Encargado() {
    }

    public Encargado(int id_encargado) {
        this.id_encargado = id_encargado;
    }

    public Encargado(String nombre_usuario, String nombre, String apellido_1, String correo_1, String numero_1) {
        this.nombre_usuario = nombre_usuario;
        this.nombre = nombre;
        this.apellido_1 = apellido_1;
        this.correo_1 = correo_1;
        this.numero_1 = numero_1;
    }

    public Encargado(int id_encargado, String nombre_usuario, String nombre, String apellido_1, String correo_1, String numero_1) {
        this.id_encargado = id_encargado;
        this.nombre_usuario = nombre_usuario;
        this.nombre = nombre;
        this.apellido_1 = apellido_1;
        this.correo_1 = correo_1;
        this.numero_1 = numero_1;
    }

    public int getId_encargado() {
        return id_encargado;
    }

    public void setId_encargado(int id_encargado) {
        this.id_encargado = id_encargado;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_1() {
        return apellido_1;
    }

    public void setApellido_1(String apellido_1) {
        this.apellido_1 = apellido_1;
    }

    public String getCorreo_1() {
        return correo_1;
    }

    public void setCorreo_1(String correo_1) {
        this.correo_1 = correo_1;
    }

    public String getNumero_1() {
        return numero_1;
    }

    public void setNumero_1(String numero_1) {
        this.numero_1 = numero_1;
    }

    @Override
    public String toString() {
        return "Encargado{" + "id_encargado=" + id_encargado + ", nombre_usuario=" + nombre_usuario + ", nombre=" + nombre + ", apellido_1=" + apellido_1 + ", correo_1=" + correo_1 + ", numero_1=" + numero_1 + '}';
    }
    
    
    
}
