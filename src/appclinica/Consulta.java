
package appclinica;


public class Consulta {
  
  
    private TipoConsulta tipoConsulta;
    private String diagnostico;
    private Medicacion medicacion;
    private Laboratorio laboratorio;
    private Cita cita;
    private int codConsulta;
    private Factura factura;


    public static MiListaEnlazada<Consulta> ListaConsultas=new MiListaEnlazada<Consulta>();
    public static int numeroConsulta=0;
    
    

    public Consulta( TipoConsulta tipoConsulta,
                    String diagnostico,
                    Medicacion medicacion, Laboratorio laboratorio, Cita cita) {

        this.tipoConsulta = tipoConsulta;
        this.diagnostico = diagnostico;
        this.medicacion = medicacion;
        this.laboratorio = laboratorio;
        this.cita = cita;
        codConsulta=numeroConsulta;
    }
    
    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }
    public int getCodConsulta() {
        return codConsulta;
    }

    public void setCodConsulta(int codConsulta) {
        this.codConsulta = codConsulta;
    }
    
    public static MiListaEnlazada<Consulta> getListaConsultas() {
        return ListaConsultas;
    }

    public static void setListaConsultas(MiListaEnlazada<Consulta> ListaConsultas) {
        Consulta.ListaConsultas = ListaConsultas;
    }

    public TipoConsulta getTipoConsulta() {
        return tipoConsulta;
    }

    public void setTipoConsulta(TipoConsulta tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Medicacion getMedicacion() {
        return medicacion;
    }

    public void setMedicacion(Medicacion medicacion) {
        this.medicacion = medicacion;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    @Override
    public String toString() {
        return "Consulta{" + "tipoConsulta=" + tipoConsulta.name() + ", diagnostico=" + diagnostico + ", medicacion=" + medicacion.getDenominacion() + ", laboratorio=" + laboratorio.getNombre() + ", cita=" + cita.getCodCita() + ", codConsulta=" + codConsulta + '}';
    }

    
}
