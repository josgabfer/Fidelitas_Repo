package Dominio;

public class Inventario {
    private int id_activo;
    private String activo_des;
    private String netbios;
    private String hostname;
    private String os;
    private String os_version;

    public Inventario() {
    }

    public Inventario(int id_activo) {
        this.id_activo = id_activo;
    }

    public Inventario(String activo_des, String netbios, String hostname, String os, String os_version) {
        this.activo_des = activo_des;
        this.netbios = netbios;
        this.hostname = hostname;
        this.os = os;
        this.os_version = os_version;
    }

    public Inventario(int id_activo, String activo_des, String netbios, String hostname, String os, String os_version) {
        this.id_activo = id_activo;
        this.activo_des = activo_des;
        this.netbios = netbios;
        this.hostname = hostname;
        this.os = os;
        this.os_version = os_version;
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

    public String getNetbios() {
        return netbios;
    }

    public void setNetbios(String netbios) {
        this.netbios = netbios;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getOs_version() {
        return os_version;
    }

    public void setOs_version(String os_version) {
        this.os_version = os_version;
    }

    @Override
    public String toString() {
        return "Inventario{" + "id_activo=" + id_activo + ", activo_des=" + activo_des + ", netbios=" + netbios + ", hostname=" + hostname + ", os=" + os + ", os_version=" + os_version + '}';
    }
    

   
    
    
    
    


    
}
