
package appclinica;


public class Factura {
    private int numeroFactura;
    private double importe;
    private CompaniaAseguradora companiaAseguradora;
    public static int idfactura=0;
    
    public static MiListaEnlazada<Factura> ListaFacturas=new MiListaEnlazada<Factura>();
    
    public Factura(double importe, CompaniaAseguradora companiaAseguradora) {
        this.importe = importe;
        this.companiaAseguradora = companiaAseguradora;
        numeroFactura=idfactura;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public CompaniaAseguradora getCompaniaAseguradora() {
        return companiaAseguradora;
    }

    public void setCompaniaAseguradora(CompaniaAseguradora companiaAseguradora) {
        this.companiaAseguradora = companiaAseguradora;
    }

    @Override
    public String toString() {
        return "Factura{" + "numeroFactura=" + numeroFactura + ", importe=" + importe + ", companiaAseguradora=" + companiaAseguradora.getNombre() + '}';
    }

   
}

