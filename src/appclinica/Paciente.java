
package appclinica;

public class Paciente {

    private String dni;
    private String nombre;
    private String apellidos;
    private String domicilio;
    private String sexo;
    private String fechaNacimiento;
    private CompaniaAseguradora companiaAseguradora;
    private Historial historial;
    private static MiListaEnlazada<Paciente> listaPacientes=new MiListaEnlazada<>();

    public Paciente(String dni, String nombre, String apellidos, String domicilio, String sexo, String fechaNacimiento, CompaniaAseguradora companiaAseguradora) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.domicilio = domicilio;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.companiaAseguradora = companiaAseguradora;
    }
    
    public static MiListaEnlazada<Paciente> getListaPacientes() {
        return listaPacientes;
    }

    public static void setListaPacientes(MiListaEnlazada<Paciente> aListaPacientes) {
        listaPacientes = aListaPacientes;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public CompaniaAseguradora getCompaniaAseguradora() {
        return companiaAseguradora;
    }

    public void setCompaniaAseguradora(CompaniaAseguradora companiaAseguradora) {
        this.companiaAseguradora = companiaAseguradora;
    }

    public Historial getHistorial() {
        return historial;
    }

    public void setHistorial(Historial historial) {
        this.historial = historial;
    }

    @Override
    public String toString() {
        return "Paciente{" + "dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", domicilio=" + domicilio + ", sexo=" + sexo + ", fechaNacimiento=" + fechaNacimiento + ", companiaAseguradora=" + companiaAseguradora.getNombre() + ", historial=" + historial + '}';
    }

 
}

