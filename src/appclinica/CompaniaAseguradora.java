
package appclinica;


public class CompaniaAseguradora {
    private String nombre;
    private String cif;
    private String domicilioSocial;
    public static MiListaEnlazada<CompaniaAseguradora> ListaCompañias=new MiListaEnlazada<CompaniaAseguradora>();
    
    public CompaniaAseguradora(String nombre, String cif, String domicilioSocial) {
        this.nombre = nombre;
        this.cif = cif;
        this.domicilioSocial = domicilioSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getDomicilioSocial() {
        return domicilioSocial;
    }

    public void setDomicilioSocial(String domicilioSocial) {
        this.domicilioSocial = domicilioSocial;
    }

    public static MiListaEnlazada<CompaniaAseguradora> getListaCompañias() {
        return ListaCompañias;
    }

    public void setListaCompañias(MiListaEnlazada<CompaniaAseguradora> ListaCompañias) {
        this.ListaCompañias = ListaCompañias;
    }

    @Override
    public String toString() {
        return "CompaniaAseguradora{" + "nombre=" + nombre + ", cif=" + cif + ", domicilioSocial=" + domicilioSocial + '}';
    }

    

    
}
