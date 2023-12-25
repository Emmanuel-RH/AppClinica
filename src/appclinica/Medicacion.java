
package appclinica;

public class Medicacion {
    private  int codigo;
    private String denominacion;
    private int dosis;
    private int duracion;
    
    public static MiListaEnlazada<Medicacion> ListaMedicacion=new MiListaEnlazada<Medicacion>();

    public Medicacion(int cod,String denominacion,
                      int dosis, int duracion) {
        this.codigo=cod;
        this.denominacion = denominacion;
        this.dosis = dosis;
        this.duracion = duracion;
    }


    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public int getDosis() {
        return dosis;
    }

    public void setDosis(int dosis) {
        this.dosis = dosis;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    
}

