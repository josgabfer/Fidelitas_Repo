package Dominio;

public class Area_TI {
    private int id_area;
    private String nombre_area;
    private String nombre_plataforma;
    private String nombre_region;

    public Area_TI() {
    }

    public Area_TI(int id_area) {
        this.id_area = id_area;
    }

    public Area_TI(String nombre_area, String nombre_plataforma, String nombre_region) {
        this.nombre_area = nombre_area;
        this.nombre_plataforma = nombre_plataforma;
        this.nombre_region = nombre_region;
    }

    public Area_TI(int id_area, String nombre_area, String nombre_plataforma, String nombre_region) {
        this.id_area = id_area;
        this.nombre_area = nombre_area;
        this.nombre_plataforma = nombre_plataforma;
        this.nombre_region = nombre_region;
    }

    public int getId_area() {
        return id_area;
    }

    public void setId_area(int id_area) {
        this.id_area = id_area;
    }

    public String getNombre_area() {
        return nombre_area;
    }

    public void setNombre_area(String nombre_area) {
        this.nombre_area = nombre_area;
    }

    public String getNombre_plataforma() {
        return nombre_plataforma;
    }

    public void setNombre_plataforma(String nombre_plataforma) {
        this.nombre_plataforma = nombre_plataforma;
    }

    public String getNombre_region() {
        return nombre_region;
    }

    public void setNombre_region(String nombre_region) {
        this.nombre_region = nombre_region;
    }

    @Override
    public String toString() {
        return "Area_TI{" + "id_area=" + id_area + ", nombre_area=" + nombre_area + ", nombre_plataforma=" + nombre_plataforma + ", nombre_region=" + nombre_region + '}';
    }
    
    
    
    
}
