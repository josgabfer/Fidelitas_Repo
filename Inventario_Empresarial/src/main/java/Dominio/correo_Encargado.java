package Dominio;


public class correo_Encargado {
    private int id_correo_encargado;
    private String correo_1;
    private String correo_2;
    private String correo_3;
    private int encargado_area_id_encargado;

    public correo_Encargado() {
    }

    public correo_Encargado(String correo_1, int encargado_area_id_encargado) {
        this.correo_1 = correo_1;
        this.encargado_area_id_encargado = encargado_area_id_encargado;
    }

    public correo_Encargado(int id_correo_encargado, String correo_1, String correo_2, String correo_3, int encargado_area_id_encargado) {
        this.id_correo_encargado = id_correo_encargado;
        this.correo_1 = correo_1;
        this.correo_2 = correo_2;
        this.correo_3 = correo_3;
        this.encargado_area_id_encargado = encargado_area_id_encargado;
    }

    public correo_Encargado(int id_correo_encargado) {
        this.id_correo_encargado = id_correo_encargado;
    }

    public correo_Encargado(String correo_1) {
        this.correo_1 = correo_1;
    }

    public int getId_correo_encargado() {
        return id_correo_encargado;
    }

    public void setId_correo_encargado(int id_correo_encargado) {
        this.id_correo_encargado = id_correo_encargado;
    }

    public String getCorreo_1() {
        return correo_1;
    }

    public void setCorreo_1(String correo_1) {
        this.correo_1 = correo_1;
    }

    public String getCorreo_2() {
        return correo_2;
    }

    public void setCorreo_2(String correo_2) {
        this.correo_2 = correo_2;
    }

    public String getCorreo_3() {
        return correo_3;
    }

    public void setCorreo_3(String correo_3) {
        this.correo_3 = correo_3;
    }

    public int getEncargado_area_id_encargado() {
        return encargado_area_id_encargado;
    }

    public void setEncargado_area_id_encargado(int encargado_area_id_encargado) {
        this.encargado_area_id_encargado = encargado_area_id_encargado;
    }

    @Override
    public String toString() {
        return "correo_Encargado{" + "id_correo_encargado=" + id_correo_encargado + ", correo_1=" + correo_1 + ", correo_2=" + correo_2 + ", correo_3=" + correo_3 + ", encargado_area_id_encargado=" + encargado_area_id_encargado + '}';
    }
    
    
    
}
