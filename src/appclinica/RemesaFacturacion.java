
package appclinica;

public class RemesaFacturacion {
    
    private Factura factura;

    public RemesaFacturacion(Factura factura) {
        this.factura = factura;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }
    
    public static MiListaEnlazada<RemesaFacturacion> ListaRemesasFacturacion=new MiListaEnlazada<RemesaFacturacion>();

    public static MiListaEnlazada<RemesaFacturacion> getListaRemesasFacturacion() {
        return ListaRemesasFacturacion;
    }

    public static void setListaRemesasFacturacion(MiListaEnlazada<RemesaFacturacion> ListaRemesasFacturacion) {
        RemesaFacturacion.ListaRemesasFacturacion = ListaRemesasFacturacion;
    }

    @Override
    public String toString() {
        return "RemesaFacturacion{" + "factura=" + factura.toString() + '}';
    }
    
    
 
}
