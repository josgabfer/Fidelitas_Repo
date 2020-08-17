package dominio;

public class activoDetalles {
    private int id_activo_detalles;
    private String netbios;
    private String hostname;
    private String os;
    private String os_version;

    public activoDetalles() {
    }

    public activoDetalles(int id_activo_detalles) {
        this.id_activo_detalles = id_activo_detalles;
    }
        public activoDetalles(int id_activo_detalles, String netbios, String hostname, String os, String os_version) {
        this.netbios = netbios;
        this.hostname = hostname;
        this.os = os;
        this.os_version = os_version;
    }

    public activoDetalles(String netbios, String hostname, String os, String os_version) {
        this.netbios = netbios;
        this.hostname = hostname;
        this.os = os;
        this.os_version = os_version;
    }

    public int getId_activo_detalles() {
        return id_activo_detalles;
    }

    public void setId_activo_detalles(int id_activo_detalles) {
        this.id_activo_detalles = id_activo_detalles;
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
        return "activoDetalles{" + "id_activo_detalles=" + id_activo_detalles + ", netbios=" + netbios + ", hostname=" + hostname + ", os=" + os + ", os_version=" + os_version + '}';
    }
    
    
}
