package dominio;


public class Activo {
    private int id_activo;
    private String activo_des;
    private int id_activo_detalles;

    public Activo() {
    }

    public Activo(int id_activo) {
        this.id_activo = id_activo;
    }

    public Activo(int id_activo, int id_activo_detalles) {
        this.id_activo = id_activo;
        this.id_activo_detalles = id_activo_detalles;
    }
    

    public Activo(String activo_des, int id_activo_detalles) {
        this.activo_des = activo_des;
        this.id_activo_detalles = id_activo_detalles;
    }

    public int getId_activo() {
        return id_activo;
    }

    public void setId_activo(int id_activo) {
        this.id_activo = id_activo;
    }

    public String getActivo_des() {
        return activo_des;
    }

    public void setActivo_des(String activo_des) {
        this.activo_des = activo_des;
    }

    public int getId_activo_detalles() {
        return id_activo_detalles;
    }

    public void setId_activo_detalles(int id_activo_detalles) {
        this.id_activo_detalles = id_activo_detalles;
    }

    @Override
    public String toString() {
        return "Activo{" + "id_activo=" + id_activo + ", activo_des=" + activo_des + ", id_activo_detalles=" + id_activo_detalles + '}';
    }
    
    
    
    
}
