
package appclinica;

public class Laboratorio {
    
    private String codigo;
    private String nombre;
    
    public static MiListaEnlazada<Laboratorio> ListaLaboratorios=new MiListaEnlazada<Laboratorio>();
    
    public Laboratorio(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}

